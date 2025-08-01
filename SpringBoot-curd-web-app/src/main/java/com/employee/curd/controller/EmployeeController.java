package com.employee.curd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.curd.model.Employee;
import com.employee.curd.service.EmployeeService;

@Controller
public class EmployeeController
{

	@Autowired
	private EmployeeService empService;
	
	//display list of employees
	@GetMapping("/")
	public String viewHomePage(Model model)
	{
		model.addAttribute("listEmployees",empService.getAllEmployees());
		return "index";
	}
	
	//add
	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model)
	{
		//create model attribute to bind form data

		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
	}
	
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee")Employee employee)
	{
		//save employee to database
		empService.saveEmployee(employee);
		return "redirect:/";
		
	}
	
	//update
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value="id")long id, Model model)
	{
		//get Employee from the service
		Employee employee = empService.getEmployeeById(id);
		
		//set employee as a model attribute to pre-populate the form
		model.addAttribute("employee", employee);
		return "update_employee";
	}
	
	// delete
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(value="id")long id)
	{
		//call delete employee method
		this.empService.deleteEmployeeById(id);
		return "redirect:/";
		
		
	}
}

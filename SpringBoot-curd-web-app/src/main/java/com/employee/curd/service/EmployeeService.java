package com.employee.curd.service;

import java.util.List;

import com.employee.curd.model.Employee;

public interface EmployeeService 
{
	List<Employee> getAllEmployees();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	void deleteEmployeeById(long id);

}

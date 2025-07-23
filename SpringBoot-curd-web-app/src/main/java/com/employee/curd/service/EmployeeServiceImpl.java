package com.employee.curd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.curd.model.Employee;
import com.employee.curd.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		 this.empRepo.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		Optional<Employee> optional = empRepo.findById(id);
		Employee employee = null;
		if(optional.isPresent())
		{
			employee = optional.get();
		}
		else
		{
			throw new RuntimeException("Employee not found for id :: " + id);
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		// TODO Auto-generated method stub
		this.empRepo.deleteById(id);
		
	}

	
	
}

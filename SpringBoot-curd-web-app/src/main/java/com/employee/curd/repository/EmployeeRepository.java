package com.employee.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.curd.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}

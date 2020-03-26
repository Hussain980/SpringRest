package com.v2.service;

import java.util.List;

import com.v2.entity.Employee;

public interface EmployeeService {
     
	public Employee save(Employee employee);
	
	public Employee getOne(Integer Id);
	
	public Employee update(Employee employee, Integer Id);
	
	 public void deleteById(Integer Id);
	 
	 public List<Employee> findAll();
}

package com.v2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.v2.entity.Employee;
import com.v2.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeRepository employeerepository;

	@Override
	public Employee save(Employee employee) {

		return employeerepository.save(employee);
	}

	@Override
	public Employee getOne(Integer Id) {
		return employeerepository.getOne(Id);
	}

	@Override
	public Employee update(Employee employee, Integer Id) {

		return employeerepository.save(employee);
	}

	@Override
	public void deleteById(Integer Id) {
		employeerepository.deleteById(Id);

	}

	@Override
	public List<Employee> findAll() {
		return (List<Employee>) employeerepository.findAll();

	}

}

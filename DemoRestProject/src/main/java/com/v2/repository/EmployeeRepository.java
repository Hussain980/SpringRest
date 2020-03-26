package com.v2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.v2.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee findById(int id);

//	Employee findOne(Integer id);
	
	
}

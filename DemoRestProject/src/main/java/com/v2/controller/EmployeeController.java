package com.v2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.v2.entity.Employee;
import com.v2.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeservice;
//	EmployeeRepository employeeRepository;

	@GetMapping("/")
	@ResponseBody
	public String home() {
		return "Spring Rest working";
	}
	/*
	 * public ModelAndView view(Model model) { ModelAndView mav = new
	 * ModelAndView("home"); return mav; }
	 */

	@GetMapping("/employees")
	public List<Employee> all() {
//		return employeeservice.list();
		return employeeservice.findAll();
	}

	@PostMapping("/employee")
	@ResponseBody
	public String create(@RequestBody Employee employee) {
		employeeservice.save(employee);
		return "Employee saved";
	}

	@GetMapping("/employee/{Id}")
	public Employee get(@PathVariable Integer Id) {
		return employeeservice.getOne(Id);
	}

	@PutMapping("/employee")
	public Employee update(@RequestBody Employee employee) {
		return employeeservice.save(employee);
	}

	@DeleteMapping("/employee/{Id}")
	public String delete(@PathVariable Integer Id) {
		employeeservice.deleteById(Id);
		return "employee Deleted";
	}
	/*
	 * @PostMapping("/save") public String view(@RequestBody Employee employee) {
	 * 
	 * employeeRepository.save(employee); return "success"; }
	 * 
	 * @GetMapping("/student") public Employee getStudent(@RequestParam("id") int
	 * id) { Employee employee = employeeRepository.findById(id);
	 * System.out.println(employee); return employee; }
	 * 
	 * @DeleteMapping("/student") public String deleteStudent(@RequestParam("id")
	 * int id) { employeeRepository.deleteById(id); return "deleted successfully"; }
	 */

}

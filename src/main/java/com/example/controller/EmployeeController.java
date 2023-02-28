package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();	
	}
	@GetMapping("/employee/{employeeId}")
	public Optional<Employee> getEmployeeByID(@PathVariable int employeeId) {
		return employeeService.getEmployeeByID(employeeId);	
	}
	
	
	@PostMapping("/employees")
	public Employee createEmployeeDetails(@RequestBody Employee employee) {
		return employeeService.saveEmployeeDetails(employee);
	}
	
	@PutMapping("/employees")
	public Employee updateOrders(@RequestBody Employee employee) {
		return employeeService.updateEmployeeDetails(employee);
	}
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		return employeeService.deleteEmployeeId(employeeId);
	}

}


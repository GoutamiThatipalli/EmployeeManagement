package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao employeeDao;
	

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.getEmployees();
	}

	@Override
	public Optional<Employee> getEmployeeByID(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeByID(employeeId);
	}

	@Override
	public Employee saveEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.saveEmployeeDetails(employee);
	}

	@Override
	public String deleteEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDao.deleteEmployeeId(employeeId);
	}

	@Override
	public Employee updateEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.saveEmployeeDetails(employee);
	}

}

package com.example.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmplyeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public List<Employee> getEmployees() {
		
		return employeeRepo.findAll();
	}

	@Override
	public Optional<Employee> getEmployeeByID(int employeeId) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(employeeId);
	}

	@Override
	public Employee saveEmployeeDetails(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public String deleteEmployeeId(int employeeId) {
		employeeRepo.deleteById(employeeId);
		// TODO Auto-generated method stub
		return "deleted successfully";
	}


}

package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("employee")
public class Employee {
	@Id
	private int employeeId;
	private String firstName;
	private String lastName;
	private Integer age;
	private Long ctc;
	private String organisation;

	public Employee() {

	}

	public Employee(int employeeId, String firstName, String lastName, int age, Long ctc, String organisation) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ctc = ctc;
		this.organisation = organisation;
	}


	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Long getCtc() {
		return ctc;
	}

	public void setCtc(Long ctc) {
		this.ctc = ctc;
	}

	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", ctc="
				+ ctc + ", organisation=" + organisation + "]";
	}

}

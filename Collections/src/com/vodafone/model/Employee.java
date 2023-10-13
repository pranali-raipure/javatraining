package com.vodafone.model;

import java.time.LocalDate;

public class Employee  implements Comparable<Employee> {
	private int empId;
	private String name;
	private LocalDate dateJoined;
	private double salary;
	
	public Employee() {
		/* default constructor */
	}

	public Employee(int empId, String name, LocalDate dateJoined, double salary) {
		this.empId = empId;
		this.name = name;
		this.dateJoined = dateJoined;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(LocalDate dateJoined) {
		this.dateJoined = dateJoined;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("empId=%s, name=%s, dateJoined=%s, salary=%s", empId, name,
				dateJoined, salary);
	}

	
	@Override	
	public int compareTo(Employee other) {
		int currentEmpId = this.empId;
		int otherEmpId = other.empId;
		if (currentEmpId == otherEmpId)
			return 0;
		else if (currentEmpId > otherEmpId)
			return 1;
		else
			return -1;
	}    
		
}
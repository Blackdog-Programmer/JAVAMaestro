/**
 * 
 */
package com.inheritance.blackdogcode;

import java.time.LocalDate;

/**
 * @author blackdogcode
 *
 */
public class Employee {

	private String name;
	private double salary;
	private LocalDate hireDate;
	
	Employee() {
		this.name = "";
		this.salary = 0.0;
		this.hireDate = LocalDate.now();
	}
	
	Employee(String name, double salary, int hireYear, int hireMonth, int hireDay) {
		this.name = name;
		this.salary = salary;
		this.hireDate = LocalDate.of(hireYear, hireMonth, hireDay); 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}
	
	@Override
	public String toString() {
		return "Employee Name: " + this.name + "\n" + "Salary: " + this.salary + "$\n" + "Hired Date: " + this.hireDate.toString();
	}
}

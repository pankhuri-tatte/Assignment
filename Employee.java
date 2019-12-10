package com.test.assigment_10dec;

import java.time.LocalDateTime;

public class Employee {
	private String name, city;
	private int salary;
	private LocalDateTime dob;

	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	Employee() {
	}

	Employee(String name, int salary, String city, LocalDateTime dob) {
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", salary=" + salary + ", dob=" + dob + "]";
	}
}

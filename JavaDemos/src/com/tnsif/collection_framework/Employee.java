package com.tnsif.collection_framework;

public class Employee {

	Integer id;
	String name;
	String email;
	Float salary;
	
	public Employee(Integer id, String name, String email, Float salary) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	
	
	
	
	
}

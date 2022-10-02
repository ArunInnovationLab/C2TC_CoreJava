package com.tnsif.JUnit5TDD;

public class Person {

	private String firstName;
	private String lastName;
	
	public Person(String fname, String lname) {
		
		if(fname == null && lname == null) {
			throw new IllegalArgumentException("Both names can not be null");
		}
		
		this.firstName = fname;
		this.lastName = lname;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}

	public String getFullName() {
		String first = (this.firstName != null)? this.firstName:"?";
		String last = (this.lastName != null)? this.lastName:"?";
		return first+" "+last;	
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	static public void main(String [] agh) {


	}
	
	
}

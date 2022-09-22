package com.tnsif.Annotations;

@VeryImportant
public class Cat {
	
	String name;
	Integer age;
	
	public Cat(String name) {
		this.name = name;
	}
	
	@RunImmedietly
	public void meow() {
		System.out.println("Meow!");
	}
	
	public void eat() {
		System.out.println("Munch");
	}
	

}

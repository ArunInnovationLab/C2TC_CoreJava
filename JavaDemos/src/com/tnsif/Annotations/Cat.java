package com.tnsif.Annotations;
@VeryImportant
public class Cat {

	public static void main(String[] args) {

		Cat cat = new Cat();
		
		cat.getClass().isAnnotationPresent(VeryImportant.class);
	}
	
	

}

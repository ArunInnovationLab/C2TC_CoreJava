package com.tnsif.interfaces;

public class Cow implements Animal {

	@Override
	public void eat() {
		 System.out.println("Cow eats Grass");
	}

	@Override
	public void makesSound() {
         System.out.println("Moww");		
	}



}

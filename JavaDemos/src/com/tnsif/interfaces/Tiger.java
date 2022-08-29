package com.tnsif.interfaces;

public class Tiger implements Animal {

	@Override
	public void eat() {
		System.out.println("Tiger eats Meat");
	}

	@Override
	public void makesSound() {
		System.out.println("Tiger roars");
	}
   
}

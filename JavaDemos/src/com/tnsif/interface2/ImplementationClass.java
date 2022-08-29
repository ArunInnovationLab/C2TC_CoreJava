package com.tnsif.interface2;

public class ImplementationClass extends AbstractClass implements I1,I2 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("I am from I2");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am from I1");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("I am from Abstract class");
	}

}

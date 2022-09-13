package com.tnsif.Generics;

public class GenericConstructor {

	private double v;
	
	
	
	public <T extends Number> GenericConstructor(T t) {
		v = t.doubleValue();
	}

	void show() {
		System.out.println("Value of v is: "+v);
	}
	
	public static void main(String[] args) {

	GenericConstructor obj = new GenericConstructor(10);
	obj.show();
	
	GenericConstructor obj1 = new GenericConstructor(190.98f);
	obj1.show();
	}

}

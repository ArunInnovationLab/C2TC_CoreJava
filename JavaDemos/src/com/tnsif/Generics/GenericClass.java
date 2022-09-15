package com.tnsif.Generics;

/*Generics means parameterized types : Parameterized types are important
because they enable you to create classes, interfaces, and methods in which the type of data
upon which they operate is specified as a parameter*/


//A simple generic class.
//Here, T is a type parameter that
//will be replaced by a real type
//when an object of type Gen is created.
class Gen<T>{
	T obj;

	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}
}

public class GenericClass {

	public static void main(String[] args) {

		Gen<String> obj = new Gen<String>();
		
		obj.add("Hello");
		obj.add("world");
		System.out.println(obj.get());
		
	}

}

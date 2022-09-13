package com.tnsif.Generics;


class GenericTest<T>{
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

		GenericTest<String> obj = new GenericTest<String>();
		
		obj.add("Hello");
		obj.add("world");
		System.out.println(obj.get());
		
	}

}

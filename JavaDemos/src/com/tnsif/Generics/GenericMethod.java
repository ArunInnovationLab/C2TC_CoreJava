package com.tnsif.Generics;

public class GenericMethod {

	public <E>void displayArrayElements(E[] elements){
		for(E element : elements) {
			System.out.println("Element is "+element);
		}
	}
	public static void main(String[] args) {

		GenericMethod obj = new GenericMethod();
		Integer[] arr = {10,20,30,40};
		String[] str = {"Java","Programming"};
		
		obj.displayArrayElements(arr);
		obj.displayArrayElements(str);
		
	}

}

package com.tnsif.Generics;

interface MinMax<T extends Comparable<T>>{
	T min();
	T max();
} 

public class GenericInterface <T extends Comparable<T>> implements MinMax<T>{

	T[] values;
	
	
	public GenericInterface(T[] values) {
		this.values = values;
	}

	public T min() {
		T obj = values[0];
		for(int i=1;i<values.length;i++) {
			if (values[i].compareTo(obj)<0) {
				obj = values[i];
			}
		}
		return obj;
	}

	
	public T max() {
		T obj = values[0];
		for(int i=1;i<values.length;i++) {
			if (values[i].compareTo(obj)>0) {
				obj = values[i];
			}
		}
		return obj;
	}
	
	public static void main(String[] args) {

		Float arr[]= {22.5f,6.9f,70.55f};
		GenericInterface<Float> o = new GenericInterface<Float>(arr);
		
		System.out.println("Minimum value is : "+o.min());
		System.out.println("Maximum value is : "+o.max());
		
	}

}

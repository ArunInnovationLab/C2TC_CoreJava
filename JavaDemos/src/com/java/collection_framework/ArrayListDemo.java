package com.java.collection_framework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		List a = new ArrayList();
		
		Student s1 = new Student(1,"Ärun",6.5f);
		Student s2 = new Student(2,"Varun",8.5f);
		Integer i = new Integer(100);
		Float f = new Float(10.5f);
		Employee e1 = new Employee(17,"Abd","abd@gmail.com",10000000f);
		Employee e2 = new Employee(11,"Ram","ram@gmail.com",10000f);

		
		a.add(s2);
		a.add(s2);
		a.add(i);
		a.add(f);
		a.add(e1);
		a.add(e2);
		
		
		Iterator it = a.iterator();
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		System.out.println();
		System.out.println("Accessing array elements ");
		
		for (int j = 0; j < a.size(); j++) {
			System.out.println("Element at index "+ j +" is "+a.get(j));
		}
		
		
	}

}

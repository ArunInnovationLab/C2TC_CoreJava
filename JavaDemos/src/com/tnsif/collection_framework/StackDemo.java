package com.tnsif.collection_framework;
import java.util.Stack;
import java.util.ListIterator;

public class StackDemo {

	//@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) {
		
		//List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack
		Stack st = new Stack();
		
		Student s1 = new Student(1,"Ärun",6.5f);
		Student s2 = new Student(2,"Varun",8.5f);
		Employee e1 = new Employee(17,"Abd","abd@gmail.com",10000000f);
		Employee e2 = new Employee(11,"Ram","ram@gmail.com",10000f);		
		Employee e3 = new Employee(12,"Modi","modi@gmail.com",30000f);
		Employee e4 = new Employee(13,"Jaun","jaun@gmail.com",1000000f);

		st.push(e4);
		st.push(e3);
		st.push(e2);
		st.push(e1);
		st.push(s2);
		st.push(s1);
		
		st.pop();
		
		
		ListIterator li = st.listIterator();
		
		
		System.out.println("Iterating the elements in forward direction: ");
		while(li.hasNext()) {
			Object o =li.next();
			System.out.println(o);
		}
		System.out.println();
		System.out.println("Iterating the elements in backward direction: ");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		
		System.out.println("\nStack st: "+st);
	
	}
}

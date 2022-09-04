package com.tnsif.CollectionFramework;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList ll=new LinkedList();
		LinkedList<String> a = new LinkedList<String>();
		
		Student s1 = new Student(1,"Ärun",6.5f);
		Student s2 = new Student(2,"Varun",8.5f);

		Employee e1 = new Employee(17,"Abd","abd@gmail.com",10000000f);
		Employee e2 = new Employee(11,"Ram","ram@gmail.com",10000f);		
		Employee e3 = new Employee(12,"Modi","modi@gmail.com",30000f);
		Employee e4 = new Employee(13,"Jaun","jaun@gmail.com",1000000f);


		a.add("arun");
		a.add("varun");
		a.toArray();
		
		ll.add(e4);
		ll.add(0, e3);
		
		ll.set(1, s1);
		
		ll.remove(s1);
		

		System.out.println("linked list : "+ll);
			
	}

}

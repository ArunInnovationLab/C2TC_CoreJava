package com.tnsif.CollectionsFramework;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class LinkedListDemo {

	public static void main(String[] args) {

		//LinkedList<String,Double> l0=new LinkedList<String,Double>();
		LinkedList ll=new LinkedList();
		LinkedList l2 = new LinkedList();
	
		
		Student s1 = new Student(1,"John Doe",6.5f);
		Student s2 = new Student(2,"Tom Smith",8.5f);

		Employee e1 = new Employee(17,"Jane Baker","jane@gmail.com",10000000f);
		Employee e2 = new Employee(11,"Tod Hall","tod@gmail.com",10000f);		

		Employee e3 = new Employee(11,"Ralph","ralph@gmail.com",10000f);	
		Employee e4 = new Employee(11,"Smith","smith@gmail.com",10000f);	
		
		
		
		ll.add(e1);
		ll.add(e1);
		ll.add(e4);
		ll.add(0, e3);
		
		ll.set(1, s1);
		
		ll.remove(s1);
		
		l2.addAll(ll);

		System.out.println("linked list 1: "+ll);
		
		System.out.println("\nlinked list 2 :"+l2);
		
		System.out.println("\nHash code of l2 :"+l2.hashCode());
		
		System.out.println("\nremove all :"+l2.removeAll(l2));	
		
		//System.out.println("\nremove If :"+l2.removeIf(null));
		
	}

}

package com.tnsif.collection_framework;

import java.util.Enumeration;
import java.util.Vector;
import java.util.Iterator;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		v.addElement(new Integer(10));
		v.addElement(new Integer(101));
		v.addElement(new Integer(12));
		v.addElement(new Integer(103));
		v.addElement(new Integer(140));
		
		
//A Vector can use the Iterator interface or Enumeration interface to traverse the elements.
		
		System.out.println("Using iterator interface to traverse the elements");
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("\nUsing enumeration interface to traverse the elements");
		Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}
		System.out.println(" ");
		System.out.println(v);
		System.out.println(" ");
		
		for(Enumeration<Integer> e1 = v.elements();e1.hasMoreElements();) {
			System.out.println(e1.nextElement());
		}
		
	}

}

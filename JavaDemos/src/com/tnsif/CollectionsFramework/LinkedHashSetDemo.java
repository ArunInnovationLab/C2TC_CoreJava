package com.tnsif.CollectionsFramework;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

/*
* LinkedHashSet maintains a linked list of the entries in the set, in the order in which
  they were inserted.
* */
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("Beta");
		lhs.add("Alpha");
		lhs.add("Eta");
		lhs.add("Gamma");
		lhs.add("Epsilon");
		lhs.add("Omega");
		
		System.out.println(lhs);
		
	}

}

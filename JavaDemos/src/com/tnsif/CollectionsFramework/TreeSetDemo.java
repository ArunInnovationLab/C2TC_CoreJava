package com.tnsif.CollectionsFramework;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
//It creates a collection that uses a tree for storage.
		
		// Create a tree set.
		TreeSet<String> ts = new TreeSet<String>();
		
		// Add elements to the tree set.
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		
		//Objects are stored in sorted, ascending order
		System.out.println(ts);
		System.out.println(ts.subSet("C", true, "F",true));
		
		
	}

}

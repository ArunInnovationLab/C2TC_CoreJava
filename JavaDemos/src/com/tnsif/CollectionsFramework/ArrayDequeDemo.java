package com.tnsif.CollectionsFramework;

import java.util.ArrayDeque;

// ArrayDequeue - function as standard, first-in, first-out queues or as last-in, first out stacks
public class ArrayDequeDemo {

	public static void main(String[] args) {

		ArrayDeque<String> adq = new ArrayDeque<String>();
		
		// Use an ArrayDeque like a stack.
		adq.push("A");
		adq.push("B");
		adq.push("C");
		adq.push("D");
		
		
		System.out.println(adq);
		adq.pop();
		System.out.println(adq);
	}

}

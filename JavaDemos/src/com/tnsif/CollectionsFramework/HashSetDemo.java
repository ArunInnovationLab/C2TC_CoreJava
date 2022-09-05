package com.tnsif.CollectionsFramework;

import java.util.HashSet;
//import java.util.Iterator;


//set can not have duplicates
/**
 * hashing - hash table-is a data structure which stores data in associative manner
 * in which insertion and access is very fast.
 * 
 * HashSet creates a collection that uses a hash table for storage.
 * 
 * The advantage of hashing is that it allows the execution time of add( ),contains( ), remove( ), and size( ) to remain constant even for large sets.
 * 
 * HashSet does not guarantee the order of its elements
 */
public class HashSetDemo {

	
	public static void main(String[] args) {

		
		HashSet<String> hs = new HashSet<String>();

		hs.add("Beta");
		hs.add("Alpha");
		hs.add("Eta");
		hs.add("Gamma");
		hs.add("Epsilon");
		hs.add("Omega");
		
		System.out.println(hs);
		
		
		
	}

}

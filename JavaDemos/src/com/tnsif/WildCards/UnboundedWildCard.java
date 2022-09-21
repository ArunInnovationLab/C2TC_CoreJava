package com.tnsif.WildCards;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCard {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(10,20,30);
		printElements(intList);
		List<Double> doubleList = Arrays.asList(20.0,10.0,5.0);
		printElements(doubleList);
	}

	//Method with Unbounded wildcard
	private static void printElements(List<?> list) {
		
		for(Object element:list) {
			System.out.println(element);
		}
                 
	}

}

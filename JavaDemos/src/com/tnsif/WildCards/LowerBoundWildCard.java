package com.tnsif.WildCards;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildCard {

	public static void main(String[] args) {

		List<Object> objList= new ArrayList<Object>();
		addNumbers(objList);
		List<Integer> intList = new ArrayList<Integer>();
		addNumbers(intList);
		
		
		
	}
  // lower bound wild card restricts the unknown type to be a specific type or a super type of that type 
  //<? super bounded_type>
		
	private static void addNumbers(List<? super Integer> list) {

		for(int i = 1; i <= 10; i++) {
			list.add(i);
		}
		System.out.println(list);
	}

}

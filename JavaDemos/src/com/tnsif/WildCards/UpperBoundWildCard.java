package com.tnsif.WildCards;

import java.util.Arrays;
import java.util.List;

public class UpperBoundWildCard {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(10,20,30);
		System.out.println("Sum = "+sumOfElements(intList));
		
		List<Double> doubleList = Arrays.asList(20.0,10.0,5.0);
		System.out.println("Sum = "+sumOfElements(doubleList));
		
	}

	//restricts the unknown type to be a specific type or a subtype of that type 
	//<? extends UpperBoundType>
	//Method with upper bounded wildcard
	private static double sumOfElements(List<? extends Number> list) {
		double sum = 0.0;
		for(Number num: list) 
			sum+=num.doubleValue();
		return sum;
	}

}

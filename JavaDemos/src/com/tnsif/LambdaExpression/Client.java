package com.tnsif.LambdaExpression;

import java.util.function.Supplier;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Predicate;


public class Client {

	public static void main(String[] args) {
    
	Maximum maximum = (int a, int b) ->{
		if(a>b) {
			System.out.println("a is the maximum");
		}else {
			System.out.println("b is the maximum");
		}
		
	    };	
	
	maximum.FindMax(9, 6);
	
	Supplier<String> s1 = ()-> "Hello World";
	System.out.println(s1.get().toString());
	
	BooleanSupplier bs = ()->{ return true;};
    System.out.println(bs.getAsBoolean());
	
	
	Consumer<String> c = (msg) -> {System.out.println(msg);};
	c.accept("Good morning");
	
	IntConsumer i = (intVariable) -> {System.out.println(intVariable);};
	i.accept(11);
	
	//Even number test
	Predicate<Integer> pd = num1 -> num1%2==0; 
	//System.out.println(pd.test(111));
	
	// even or odd 
	int arr[] = {2,3,4};
	int evencount=0;
	int oddcount=0;
	for (int j = 0; j < arr.length; j++) {
		if(pd.test(arr[j])){
			evencount++;
		}else {
			oddcount++;
		}
	}
	System.out.println("Even "+evencount);
	System.out.println("Odd "+oddcount);
	
	
	
	}
	
}

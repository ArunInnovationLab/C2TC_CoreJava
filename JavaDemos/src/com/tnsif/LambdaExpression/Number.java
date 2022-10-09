package com.tnsif.LambdaExpression;

interface MyNumber{
	double getValue();
}

public class Number{

	public static void main(String[] args) {

		MyNumber myNumber = () -> 123.45;
		
		System.out.println(myNumber.getValue());

	}


	
	
}

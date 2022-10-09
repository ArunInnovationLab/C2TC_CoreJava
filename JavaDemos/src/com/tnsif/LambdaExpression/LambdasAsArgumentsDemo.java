package com.tnsif.LambdaExpression;

interface StringFunc1 {
	String func (String n);
}

public class LambdasAsArgumentsDemo {

	static String stringOp(StringFunc sf,String s) {
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		String inStr = "Lambdas add power to Java";
		String outStr;
		System.out.println("Input string : "+inStr);
	}
	
}

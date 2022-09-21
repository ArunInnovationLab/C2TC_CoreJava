package com.tnsif.LambdaExpression;

public class Client {

	public static void main(String[] args) {
    
	Maximum maximum = (int a, int b) ->{
		if(a>b) {
			System.out.println("a is the maximum");
		}else {
			System.out.println("b is the maximum");
		}
		}
	;	
		
	maximum.FindMax(9, 6);
	}

}

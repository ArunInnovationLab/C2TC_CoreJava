package com.tnsif.LambdaExpression;

//Block lambda that computes the factorial of an int value.

interface NumericFunc {
	int func(int n);
}
public class BlockLambdaDemo {

	public static void main(String[] args) {
		NumericFunc factorial = (n) ->{
			int result = 1;
			for(int i=1;i<=n;i++) {
				result = result*i;
			}
			return result;
		};
		
		
		System.out.println("factorial of 3 = "+factorial.func(3));
	}
}

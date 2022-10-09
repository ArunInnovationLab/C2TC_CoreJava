package com.tnsif.LambdaExpression;

//A block lambda that reverses the characters in a string.

interface StringFunc {
	String func(String n);
}

public class BlockLambdaDemo2 {

	public static void main(String[] args) {
		
		StringFunc reverse = (n)->{
			String str = " ";
			
			for(int i = n.length()-1 ; i>=0;i-- ) {
				str += n.charAt(i);
			}
			return str;
		};
		
		
		System.out.println(reverse.func("Hello World"));
	}

}

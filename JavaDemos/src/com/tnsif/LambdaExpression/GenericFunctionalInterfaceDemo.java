package com.tnsif.LambdaExpression;

interface SomeFunc<T>{
	T func(T n);
}

public class GenericFunctionalInterfaceDemo {

	public static void main(String[] args) {

		SomeFunc<Integer> factorial = (n) ->{
			int result = 1;
			for(int i=1;i<= n;i++) {
				result = result*i;
			}
			return result;
		};
		System.out.println("factorial of 3 = "+factorial.func(3));
	
		SomeFunc<String> reverse = (n)->{
			String str = " ";
			
			for(int i = n.length()-1 ; i>=0;i-- ) {
				str += n.charAt(i);
			}
			return str;
		};		
		System.out.println("Reverse of 'Hello Wrld' : "+reverse.func("Hello World"));
	}

}

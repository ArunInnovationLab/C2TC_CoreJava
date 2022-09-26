package com.tnsif.ExceptionHandling;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
        
		Integer a = 50/20;
		System.out.println(a);
		
		Integer b =20/2;
		System.out.println(b);
		
		boolean spam = true;
		
			try {
				Integer c = 30 / 0;
				spam=false;
				System.out.println(c);
			} catch (Exception e) {
				System.out.println(e);
			}

			finally {
				System.out.println("hello world");
			} 
		
		Integer d = 30/3;
		System.out.println(d);
		
	}

}

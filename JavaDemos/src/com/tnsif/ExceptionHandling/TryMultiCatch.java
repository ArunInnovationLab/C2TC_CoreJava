package com.tnsif.ExceptionHandling;

public class TryMultiCatch {

	public static void main(String[] args) {

		try {
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42 / a;
			int c[] = { 1 };
			c[42] = 99;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
		}
		

	}

}

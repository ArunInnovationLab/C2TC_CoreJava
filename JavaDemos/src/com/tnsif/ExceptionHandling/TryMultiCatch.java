package com.tnsif.ExceptionHandling;

public class TryMultiCatch {

	public static void main(String[] args) {

		int[] a = new int[5];
		try {
			a[9] = 10/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} 
		
		
		
	}

}

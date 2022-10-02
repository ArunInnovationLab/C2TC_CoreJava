package com.tnsif.ExceptionHandling;

public class ChainExcDemo {

	static void demoproc() {
		
		//create an exception 
		NullPointerException e = new NullPointerException("Top layer");
		
		//add a cause
		e.initCause(new ArithmeticException("cause"));
		
		throw e;
	}
	public static void main(String[] args) {
        
		try {
			demoproc();
		} catch (NullPointerException e) {
			
			//display the top level exception
			System.out.println("Caught "+e);
			
			//display cause exception
			System.out.println("Original cause: "+e.getCause());
		}
	
	}

}

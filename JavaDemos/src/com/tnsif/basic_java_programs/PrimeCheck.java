package com.tnsif.basic_java_programs;

public class PrimeCheck {

	public static void main(String[] args) {
		int number = 1000;
		boolean isPrime=true;
		
		if(number==0||number==1) {
			isPrime=false;
		}
		
		for(int i=2;i<number/2;i++) {
			if(number%i==0) 
				isPrime=false;
			    break;
		}
		
		if(isPrime==true) {
			System.out.println("The number "+number+" is a prime number");
		}
		else {
			System.out.println("The number "+number+" is not a prime number");
		}
		

	}

}

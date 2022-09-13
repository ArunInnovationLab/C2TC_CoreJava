package com.tnsif.Arrays;

import java.util.Scanner;

public class ArrayDemo {

	int intNumbers[];
	
	ArrayDemo(int i){
		intNumbers=new int[i];
	}
	
	void populateArray() {
		System.out.println("Enter the array elements");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<intNumbers.length;i++) {
			intNumbers[i]=sc.nextInt();
		}
		sc.close();
	}
	
	void displayContents() {
		for(int i=0;i<intNumbers.length;i++) {
			System.out.println("Number at index "+i+" : "+intNumbers[i]);
		}
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		ArrayDemo ad = new ArrayDemo(size);
		
		ad.populateArray();
		ad.displayContents();
	    
		sc.close();
		
		
	}
	

}



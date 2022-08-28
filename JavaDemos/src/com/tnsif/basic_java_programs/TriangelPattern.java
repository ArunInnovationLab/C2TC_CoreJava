package com.tnsif.basic_java_programs;

public class TriangelPattern {

	public static void main(String[] args) {
		
		//Right angle triangle
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Left angled triangle
		for(int i=1;i<=5;i++) {
			for(int j=(5-i);j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		//Equilateral triangle
		for(int i=1;i<=5;i++) {
			for(int j=(5-i);j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		

	}

}

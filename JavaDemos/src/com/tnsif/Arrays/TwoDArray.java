package com.tnsif.Arrays;

public class TwoDArray {

	public static void main(String[] args) {

		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("\n Jagged array");
		// jagged array 
		
		int arr1[][]= {{1,2,3},{4,5},{7,8,9}};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	
	
		int arr2[][]= new int[2][3];
	}
	
	

}

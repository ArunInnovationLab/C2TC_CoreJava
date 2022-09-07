package com.tnsif.arrays;
import java.util.Arrays;

public class ArraysClassDemo {

	int ar[];
    static void sort(int ar[]) {
		Arrays.sort(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

	int arr[] = {10,20,5,30,16};
	sort(arr);
		
	}

	

}

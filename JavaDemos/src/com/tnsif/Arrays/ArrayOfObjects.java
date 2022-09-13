package com.tnsif.Arrays;
import com.tnsif.CollectionsFramework.Student;

public class ArrayOfObjects {

	public static void main(String[] args) {

		Student arr[];
		
		arr = new Student[5];
		
		Student s1 = new Student(101,"jhjd",55.6f);
		Student s2 = new Student(101,"jhjd",55.6f);
		Student s3 = new Student(101,"jhjd",55.6f);
		Student s4 = new Student(101,"jhjd",55.6f);
		Student s5 = new Student(101,"jhjd",55.6f);
		//or
//		
//		arr[0]=s1;
//		arr[1]=s2;
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		
		System.out.println(s1);
		
		
		
		
		

	}

}

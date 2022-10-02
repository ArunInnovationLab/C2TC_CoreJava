package com.tnsif.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExceptionDemo {

	public static void main(String[] args) {
                       
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     
		int i = 0;
		try {
			i = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			System.out.println(e);
		}
		System.out.println(i);
		
	}

}
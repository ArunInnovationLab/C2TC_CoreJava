package com.tnsif.JUnit5TDD;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	
	@Test
	void testOnDev() {
		System.setProperty("ENV", "DEV");
		Assumptions.assumeFalse("DEV".equals(System.getProperty("EN")),AssumptionDemo::message);
		System.out.println("test passed");
	}
	
	@Test
	void testOnProd() {
		System.setProperty("ENV", "DEV");
		Assumptions.assumingThat("DE".equals(System.getProperty("ENV")),()->{
			System.out.println(3+3);
		});
		System.out.println("test passed");
	}
	
	private static String message() {
		return "TEST EXECUTION FAILED";
	}
	
	
	
	

	
	
}

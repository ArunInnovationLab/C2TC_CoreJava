package com.tnsif.JUnit5TDD;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface TestLifeCycleLogger {

	@BeforeAll
	default void beforeAllTests() {
		System.out.println("Before all tests");
	}
	
	@AfterAll
	default void AfterAllTests() { 
		System.out.println("After all tests");
	}
	
	@Test
	default void testMethod() {
		System.out.println("This is test method..");
	}
	
}

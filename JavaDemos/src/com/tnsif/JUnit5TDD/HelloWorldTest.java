package com.tnsif.JUnit5TDD;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class HelloWorldTest implements TestLifeCycleLogger {

	@RepeatedTest(10)
	@Test
	void test() {
		System.out.println("First test case");
	}
}

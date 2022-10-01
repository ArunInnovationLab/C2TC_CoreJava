package com.tnsif.JUnit5TDD;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestGreeting {

	@Test
	public void testGreet() {
		Greeting greeting = new Greeting();
		assertEquals("Unexpected result","Welcome to Java",greeting.greet());
	}
}

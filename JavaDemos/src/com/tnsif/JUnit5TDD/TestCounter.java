package com.tnsif.JUnit5TDD;


import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestCounter {

	Counter counter = new Counter();
	
	@Test
	public void inceremntTest() {
		assertTrue(1==counter.increment());
		assertTrue(2==counter.increment());
	}
	
	@Test
	public void decrementTest() {
		assertTrue(-1==counter.decrement());
	}
		
}

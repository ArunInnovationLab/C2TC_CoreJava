package com.tnsif.JUnit5TDD;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled
public class AssertDemo {

	@Test
	public void compare() {
		int A = 1;
		int B = 2;
		assertEquals(A,B);
	}
	
	
	@Test
	public void compare1() {
		int expected = 1;
		int actual = 1;
		assertTrue(expected==actual);
	}
	
	@Disabled
	@Test
	public void compar3() {
		int A = 1;
		int B = 1;
		assertEquals(A,B);
	}
	
	
	

}



package com.tnsif.JUnit5TDD;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestPerson {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before all");
	}
	
	@Test
	public void testFirstName() {
		System.out.println("test 1");
		Person person = new Person("Robert","King");
		assertEquals("Unexpected result","Rbert",person.getFirstName());
	}
	
    @Test
	public void testLastName() {
    	System.out.println("test 2");
		Person person = new Person("Robert","King");
		assertEquals("Unexpected result","King",person.getLastName());
	}
    
    @Test
    public void testFullName() {
    	System.out.println("test 3");
    	Person person = new Person("Robert","King");
		assertEquals("Unexpected result","Robert King",person.getFullName());
    }
	
    @Test
    public void testNullInName() {
    	System.out.println("test 4");
    	Person person = new Person(null,"King");
    	assertNotNull("First name is null",person.getFirstName());
    	assertNotNull("Last name is Null", person.getLastName());
    }
    
    @AfterAll
    public static void afterAll() {
    	System.out.println("After all");
    }
}

package com.tnsif.JUnit5TDD;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {

	@ParameterizedTest
	@ValueSource(strings = {"1","2","3","four"})
	void withValueSourse(int number) {
		assertNotNull(number);
	}
}
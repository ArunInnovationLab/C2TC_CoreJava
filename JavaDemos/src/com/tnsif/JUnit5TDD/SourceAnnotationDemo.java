package com.tnsif.JUnit5TDD;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

public class SourceAnnotationDemo {

	@DisplayName("Roman numeral")
	@ParameterizedTest(name = "\"{0}\" should be {1}")
	@CsvSource({"I,1","II,2","V,5"})
	void withNiceName(String word, int number) {
		System.out.println(word+number);
	}
	
	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	void withAllEnumValues(TimeUnit unit) {
		System.out.println(unit);
	}
	
	@ParameterizedTest
	@EnumSource(
		value = TimeUnit.class,
		names = {"NANOSECONDS","MICROSECONDS"})
    void withSomeEnumValues(TimeUnit unit) {
    	System.out.println(unit);
    }
	
	private static Stream <Arguments> createWordsWithLength(){
		return Stream.of(
			Arguments.of("Hello", 5),
			Arguments.of("JUnit 5",7)
			);
	}
	
	@ParameterizedTest
	@MethodSource("createWordsWithLength")
	void withMethodSource(String word, int length) {
		System.out.println(word+length);
	}
}

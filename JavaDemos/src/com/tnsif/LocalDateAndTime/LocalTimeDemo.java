package com.tnsif.LocalDateAndTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {

	public static void main(String[] args) {

		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalTime currentTime2 = LocalTime.parse("06:30");
		System.out.println(currentTime2);
		
		LocalTime of = LocalTime.of(9, 30);
		System.out.println(of);
		
		LocalTime addTime = of.plus(2,ChronoUnit.HOURS);
		System.out.println(addTime);
		
		System.out.println(LocalTime.parse("06:30").isAfter(LocalTime.parse("05:30")));
		
		System.out.println(LocalTime.MAX);
		
		System.out.println(LocalTime.MIN);
		
	}

}

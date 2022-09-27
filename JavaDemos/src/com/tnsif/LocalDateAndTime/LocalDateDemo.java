package com.tnsif.LocalDateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Clock;
import java.time.DayOfWeek;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;


public class LocalDateDemo {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		Clock clock = Clock.systemDefaultZone();
		//LocalDate ld2 = LocalDate.now(clock);
		System.out.println(clock);
		
		ZoneId zone = ZoneId.of("Australia/Darwin");
		LocalDate ld3 = LocalDate.now(zone);
		System.out.println(ld3);
		
		//Parse date
		LocalDate ld4 = LocalDate.parse("2018-12-03");
		System.out.println(ld4);
		
		LocalDate ld5 = LocalDate.of(2000, 10, 02);
		System.out.println(ld5);
		System.out.println("-----------------------");
		//Add days
		LocalDate plus = ld5.plusDays(5);
		System.out.println(plus);
		
		//Subtract days
		LocalDate minus = plus.minus(2, ChronoUnit.DAYS);
		System.out.println(minus);
		
		System.out.println("------------------");
		//Day of week, month and year
		DayOfWeek dayofweek = ld4.getDayOfWeek();
		System.out.println(dayofweek);
		System.out.println(ld4.getDayOfMonth());
		System.out.println(ld4.getDayOfYear());
		
		System.out.println("----------------------");
		//Is leap year?
		LocalDate thisyear = LocalDate.now();
		System.out.println(thisyear.isLeapYear());
		
		LocalDate previous_year = thisyear.minusYears(6);
		System.out.println(previous_year.isLeapYear());
		
		System.out.println("-------------------");
		boolean before = LocalDate.parse("2022-09-10").isBefore(LocalDate.now());
		System.out.println(before);
		
		boolean after = LocalDate.parse("2022-09-10").isAfter(LocalDate.now());
		System.out.println(after);
		
		System.out.println("----------------------");
		LocalDateTime startofday = LocalDate.now().atStartOfDay();
		System.out.println(startofday);
		
		LocalDate with = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(with);
		
	}

}

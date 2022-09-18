package com.tnsif.LocalDateAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDurationDemo {

	public static void main(String[] args) {

		LocalDate initialDate =LocalDate.now();
		
		//Period class represents the quantity of time in terms of years, months and days.
		LocalDate ld = initialDate.plus(Period.ofDays(50));
		System.out.println(ld);
		
		LocalDate finalDate = initialDate.plus(Period.ofDays(5));
		int days = Period.between(initialDate, finalDate).getDays();
	    System.out.println(days);
	    
	    long between = ChronoUnit.DAYS.between(initialDate, finalDate);
	    System.out.println(between);
	    
	    
	    System.out.println("----------------");
	    //Duration class is used to deal with Time. It represents the quantity of time in terms of seconds and nano seconds.
	    LocalTime initialTime = LocalTime.of(06, 30, 0);
	    LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
	    
	    System.out.println(Duration.between(initialTime, finalTime).getSeconds());
	    System.out.println(ChronoUnit.SECONDS.between(initialTime, finalTime));
	   
	   
	}

}

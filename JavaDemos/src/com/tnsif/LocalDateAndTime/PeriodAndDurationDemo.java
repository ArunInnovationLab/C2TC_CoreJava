package com.tnsif.LocalDateAndTime;

import java.time.LocalDate;
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
	    
	    
	    
	    //Duration class is used to deal with Time. It represents the quantity of time in terms of seconds and nano seconds.
	    
	    
	   
	   
	}

}

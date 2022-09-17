package com.tnsif.LocalDateAndTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.now();
    System.out.println(ldt);
    LocalDateTime ldtAdd = ldt.plus(2, ChronoUnit.DAYS);
    System.out.println(ldtAdd);
    LocalDateTime ldt1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
    System.out.println(ldt1);
    
    LocalDateTime ldt2 = LocalDateTime.parse("2022-09-17T16:52:12") ;
    System.out.println(ldt2);
    
    LocalDate ld = ldt2.toLocalDate();
    System.out.println(ld);
    
    LocalTime lt = ldt2.toLocalTime();
    System.out.println(lt);
    
    System.out.println(ldt2.isBefore(ldt));
    
    System.out.println(LocalDateTime.MAX);
    System.out.println(LocalDateTime.MIN);
	}

}

package com.tnsif.LocalDateAndTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.Set;

public class ZonedDateTimeAPI {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		/*
		 * Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		 * 
		 * Iterator it = availableZoneIds.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */        //availableZoneIds.forEach(System.out::println);

		ZoneId zone = ZoneId.of("Asia/Tokyo");
		System.out.println(LocalDateTime.now(zone));
		
		ZoneId zone1 = ZoneId.of("Asia/Kolkata");
		System.out.println("Kolkata : "+LocalDateTime.now(zone1));
		
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.now(),zone);
		System.out.println(zdt);
		
		LocalDateTime of = LocalDateTime.of(2015, Month.FEBRUARY, 20,06,30);
		
		ZoneOffset offset = ZoneOffset.of("+02:00");
		
		OffsetDateTime odt = OffsetDateTime.of(of, offset);
		System.out.println(odt);
		
		LocalDateTime ldt = LocalDateTime.ofEpochSecond(1000000000, 1, offset);
		System.out.println(ldt);
		
		
		
	}

}

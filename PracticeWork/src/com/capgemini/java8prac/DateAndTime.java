package com.capgemini.java8prac;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		System.out.println(d.getDayOfWeek().toString());
		System.out.println(t.getHour());
	}

}

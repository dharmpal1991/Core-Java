package com.geeks.java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test8 {
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		int d1 = d.getDayOfYear();
		int d2 = d.getDayOfMonth();
		int d3 = d.getYear();
		System.out.println(d1+"::"+d2+"::"+d3);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		int t1 = t.getHour();
		int t2 = t.getMinute();
		int t3 = t.getSecond();
		int t4 = t.getNano();
		System.out.println(t1+" "+t2+" "+t3+" "+t4);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
	}

}

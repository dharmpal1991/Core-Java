package com.geeks.java8features;

import java.util.function.Predicate;

public class Test2 {
	public static void main(String[] args) {
		Predicate<Integer> p = i ->(i>10);
		System.out.println(p.test(100));
		System.out.println(p.test(7));
		System.out.println(p.test(12));
		// test is method of predicate interface
		// predicate use for condition check
		Predicate<String> str = s ->(s.length()>4);
		System.out.println(str.test("dharmpal"));
		System.out.println(str.test("dk"));
	}
}

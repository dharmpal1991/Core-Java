package com.dharmpal.enumQuestion;

public class Test {
	public static void main(String[] args) {
		Month m = Month.April;
		System.out.println(m);
		switch (m) {
		case January:
			System.out.println("it is January");
			break;
		case Feburary:
			System.out.println("it is Feburary");
			break;
		case March:
			System.out.println("it is March");
			break;
		case April:
			System.out.println("it is April");
			break;
		case May:
			System.out.println("it is May");
			break;
		case June:
			System.out.println("it is June");
			break;
		case July:
			System.out.println("it is July");
			break;
		case Auguest:
			System.out.println("it is Auguest");
			break;
		case September:
			System.out.println("it is September");
			break;
		case October:
			System.out.println("it is October");
			break;
		case November:
			System.out.println("it is November");
			break;
		case December:
			System.out.println("it is December");
			break;
		}
		Month[] m1 = Month.values();
		for (Month m2 : m1) {
			System.out.println(m2 + "......" + m2.ordinal());
		}
		Vegitable[] v = Vegitable.values();
		for (Vegitable v1 : v) {
			System.out.println(v1 + "......" + v1.getPrice());
		}
	}
}

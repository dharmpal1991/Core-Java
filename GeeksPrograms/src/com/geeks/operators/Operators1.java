package com.geeks.operators;

public class Operators1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		 int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
	        boolean condition = true;
	        // pre-increment operator
	        c = ++a;
	        System.out.println("Value of c (++a) = " + c);
	        // post increment operator
	        c = b++;
	        System.out.println("Value of c (b++) = " + c);
	        // pre-decrement operator
	        c = --d;
	        System.out.println("Value of c (--d) = " + c);
	        // post-decrement operator
	        c = --e;
	        System.out.println("Value of c (--e) = " + c);
	        // Logical not operator
	        System.out.println("Value of !condition =" + !condition);
	 
	}

}

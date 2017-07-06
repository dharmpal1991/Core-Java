package com.StringInterview;

import java.util.Scanner;

public class StringConcatination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String s1 = sc.next();
		System.out.println("Enter Middle name");
		String s2 = sc.next();
		System.out.println("Enter Last name");
		String s3 = sc.next();
		System.out.println("Your full name::"+s1+" "+s2+" "+s3);
		sc.close();
	}

}

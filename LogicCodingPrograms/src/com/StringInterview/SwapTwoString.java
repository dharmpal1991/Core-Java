package com.StringInterview;

import java.util.Scanner;

public class SwapTwoString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String:");
		String s1 = sc.next();
		System.out.println("Enter Second String:");
		String s2 = sc.next();
		
		s1 = s1+s2;
		s2 = s1.substring(0,( s1.length()-s2.length()));
		s1 = s1.substring(s2.length());
		System.out.println(s1);
		System.out.println(s2);
		sc.close();
	}

}

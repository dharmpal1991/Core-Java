package com.Demo;

import java.util.Scanner;

public class IndexDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "abcdefghijklmnopqrstuvwxyz";
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		System.out.println("Enter the index:");
		int a = sc.nextInt();
		System.out.println(s1.charAt(a));
		System.out.println(s1.indexOf('r'));
		System.out.println(s1.replace('a', 'b'));
		System.out.println(s1.length());
	
	}
}

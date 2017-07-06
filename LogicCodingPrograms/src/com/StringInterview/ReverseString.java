package com.StringInterview;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		for (;;) {
			String s = sc.next();
			String str = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				str = str + s.charAt(i);
			}
			System.out.println(str);
			System.out.println(" ");
			sc.close();
		}

	}

}

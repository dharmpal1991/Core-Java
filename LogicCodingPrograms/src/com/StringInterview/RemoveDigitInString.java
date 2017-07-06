package com.StringInterview;

import java.util.Scanner;

public class RemoveDigitInString {
	public static String RemoveStringDigits(String str){
		String str1 ="";
		char [] c =str.toCharArray();
		for(char ch : c){
			if(ch>65 && ch<90 || ch>97 && ch <122){
				str1 = str1+ch;
			}
		}
		return str1;
	}
	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(RemoveStringDigits(s));
		sc.close();
	}

}

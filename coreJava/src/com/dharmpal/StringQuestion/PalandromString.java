package com.dharmpal.StringQuestion;

import java.util.Scanner;

public class PalandromString {
	public static void palandromString(String string){
		String original = string;
		String reverse = "";
		
		for(int i = original.length()-1;i>=0;i--){
			reverse = reverse +original.charAt(i);
		}
		if(original.equals(reverse)){
			System.out.println("String is Palandrom");
		}
		else
			System.out.println("String is not Palandrom");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.next();
		palandromString(str);
		sc.close();
	}

}

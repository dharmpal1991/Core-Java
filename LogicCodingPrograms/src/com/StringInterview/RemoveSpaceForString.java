package com.StringInterview;

import java.util.Scanner;

public class RemoveSpaceForString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		String str = "";
		for(char c : s.toCharArray()){
			if(c!=' '){
				str = str+c;
			}
		}
		System.out.println(str);
		sc.close();
	}
}

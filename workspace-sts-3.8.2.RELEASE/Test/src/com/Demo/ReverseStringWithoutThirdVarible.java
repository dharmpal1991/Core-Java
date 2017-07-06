package com.Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringWithoutThirdVarible {
	public static void reverseString (String string1,String string2){
		string1 = string1+string2;
		string2 =string1.substring(0,string1.length()-string2.length());
		string1 = string1.substring(string2.length(),string1.length());
		System.out.println(string1);
		System.out.println(string2);
	}
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter the First String:");
		String string1 = br.readLine();
		System.out.println("Enter the Second String:");
		String string2 = br.readLine();
		reverseString(string1, string2);
		
	}

}

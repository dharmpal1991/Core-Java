package com.dharmpal.StringQuestion;

public class CharPastEndOfArray {
	public static String str1 = "";
	public static String str2 = "";
	public static String str3 = "";
	
	public static String modifyString(String s,int n){
		for(int i =0;i<s.length();i++){
			if(s.charAt(n) != s.charAt(i))
				str1 = str1+s.charAt(i);
		}
		return str1+s.charAt(n);
	}
	public static void main(String[] args) {
		System.out.println(modifyString("dharmpal", 2));
	}
}

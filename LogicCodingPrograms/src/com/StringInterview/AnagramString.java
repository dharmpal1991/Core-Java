package com.StringInterview;

import java.util.Arrays;

public class AnagramString {
	public static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		str1 = sortCharacter(str1);
		str2 = sortCharacter(str2);
		return str1.equals(str2);
	}

	public static String sortCharacter(String str) {
		char[] c = str.toLowerCase().toCharArray();
		Arrays.sort(c);
		return String.valueOf(c);
	}

	public static void main(String[] args) {
		String s1 = "poorman";
		String s2 = "pomanor";
		if (isAnagram(s1, s2))
			System.out.println("this is Anagram");
		else
			System.out.println("not Anagram");
	}
}

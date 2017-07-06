package com.StringInterview;

public class Characters {

	public static String characterType(char c) {
		if (c >= 65 && c <= 90 || c >= 97 && c <= 122) {
			return c + " : Alphabate Type";
		} else if (c >= 48 && c <= 57) {
			return c + " : Digit Type";
		} else
			return c + " : Special Symbol";
	}

	public static void main(String[] args) {
		String str = characterType('a');
		System.out.println(str);
	}

}

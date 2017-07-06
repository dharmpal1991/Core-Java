package com.StringInterview;

public class SortString {
	public static void main(String[] args) {
		String str = "edhjaks";
		char temp;
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] > chars[j]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
	}
}

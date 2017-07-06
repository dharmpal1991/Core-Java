package com.StringInterview;

public class PalindromeString {
	private static boolean palindrom1(String str) {
		char[] c = str.toCharArray();
		boolean flag = true;
		int end = c.length - 1;
		for (int i = 0, j = end; i < j; i++, j--) {
			if (c[i] != c[j]) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	private static boolean palindrom2(String str1) {
		if (str1 == null)
			return false;
		StringBuilder strBuilder = new StringBuilder(str1);
		strBuilder.reverse();
		return strBuilder.toString().equals(str1);
	}

	public static void main(String[] args) {
		String s = "aba";
		if (palindrom1(s) == true)
			System.out.println("String is Palindrom");
		else
			System.out.println("String is Not Palindrom");
		System.out.println("*************************************");
		String s1 = "aba";
		if (palindrom2(s1) == true)
			System.out.println("String is Palindrom");
		else
			System.out.println("String is Not Palindrom");

	}
}

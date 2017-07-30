package com.dharmpal.StringQuestion;

public class CheckStringIsPalindrome {
	private static boolean isPalindrome1(String str) {
		char[] chr = str.toCharArray();
		boolean flag = true;
		int end = chr.length - 1;
		for (int i = 0, j = end; i < j; i++, j--) {
			if (chr[i] != chr[j]) {
				flag = false;
				break;
			}
		}
		return flag;

	}

	private static boolean isPalindrome2(String str) {
		if (str == null)
			return false;
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		return strBuilder.toString().equals(str);
	}

	public static void main(String[] args) {
		String s = "abcdcbaad";

		System.out.println("1st way Check String is palindrome by logic");
		if (isPalindrome1(s) == true)

			System.out.println("Entered string is palindrome");

		else
			System.out.println("Entered string is not a palindrome");

		System.out.println("**************************************************");

		System.out.println("2nd way Check String is palindrome by predefine methods");
		if (isPalindrome2(s) == true)

			System.out.println("Entered string is palindrome");

		else
			System.out.println("Entered string is not a palindrome");

	}

}

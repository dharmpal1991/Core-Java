package com.StringInterview;

public class LongestPalindromString {
	public static String longestPalindorm(String str) {
		int leftIndex = 0;
		int rightIndex = 0;
		String currentPalindrom = "";
		String biggestPalindrom = "";
		for (int centerIndex = 1; centerIndex < str.length() - 1; centerIndex++) {
			leftIndex = centerIndex - 1;
			rightIndex = centerIndex + 1;
			while (leftIndex >= 0 && rightIndex < str.length()) {
				if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
					break;
				}
				currentPalindrom = str.substring(leftIndex, rightIndex + 1);
				biggestPalindrom = currentPalindrom.length() > biggestPalindrom
						.length() ? currentPalindrom : biggestPalindrom;
				leftIndex--;
				rightIndex++;
			}
		}
		return biggestPalindrom;

	}

	public static void main(String[] args) {
		String str = "GABCDCBAT45678987654Z";
		System.out.println(longestPalindorm(str));
	}

}

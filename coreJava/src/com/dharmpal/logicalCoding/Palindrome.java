package com.dharmpal.logicalCoding;

public class Palindrome {
	public static int isPalindrom(int number) {
		int temp = number, remender = 0, sum = 0;
		while (temp > 0) {
			remender = temp % 10;
			sum = sum * 10 + remender;
			temp = temp / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int number = 434;
		int n = isPalindrom(number);
		if (number == n) {
			System.out.println("Number is Palindrom");
		} else
			System.out.println("Number is Not Palindrom");
	}

}

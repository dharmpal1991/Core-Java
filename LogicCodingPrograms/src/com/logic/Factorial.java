package com.logic;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		long fact = 1;
		for(int i=1;i<=num;i++){
			fact = fact*i;
		}
		System.out.println(fact);
	}

}

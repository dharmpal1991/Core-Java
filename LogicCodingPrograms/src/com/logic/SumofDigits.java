package com.logic;

import java.util.Scanner;

public class SumofDigits {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int sum=0;
		while(num>0){
			sum =sum+num%10;
			num = num/10;
		}
		System.out.println(sum);
	}

}

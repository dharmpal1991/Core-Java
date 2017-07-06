package com.logic;

import java.util.Scanner;

public class EvenandOdd {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		if(num%2 == 0){
			System.out.println("Number is Even");
		}
		else
			System.out.println("Odd Number");
	}

}

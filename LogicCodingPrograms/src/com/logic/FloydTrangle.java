package com.logic;

import java.util.Scanner;

public class FloydTrangle {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int number = 1;
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}

}

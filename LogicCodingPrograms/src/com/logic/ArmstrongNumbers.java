package com.logic;

import java.util.Scanner;

public class ArmstrongNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int c=0,a,temp;
		temp = num;
		while(num>0){
			a = num%10;
			num = num/10;
			c = c+(a*a*a);
		}
		if(temp==c){
			System.out.println("Number is Armstrong");
		}
		else
			System.out.println("Number is Not Armstrong");
	}
}

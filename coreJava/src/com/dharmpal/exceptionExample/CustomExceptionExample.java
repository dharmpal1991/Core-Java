package com.dharmpal.exceptionExample;

import java.util.Scanner;

class TooYoungException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TooYoungException(String str) {
		super(str);
	}
}
class TooOldException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TooOldException(String str){
		super(str);
	}
}
public class CustomExceptionExample {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Age");
		int age = sc.nextInt();
		if(age>60){
			throw new TooOldException("You are over Age");
		}
		else if(age<18){
			throw new TooYoungException("You are under Age");
		}
		else
			System.out.println("You are Eligible for Marrige");
	}
}

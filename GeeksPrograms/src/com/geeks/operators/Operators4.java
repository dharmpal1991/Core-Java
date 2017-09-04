package com.geeks.operators;

import java.util.Scanner;

public class Operators4 {
	public static void main(String[] args) {
		String name = "dharmpal";
		String id = "kansujia";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name:");
		String userName = sc.next();
		System.out.println("Enter user id :");
		String userId = sc.next();
		
		if(name.equals(userName) && id.equals(userId) || name.equals(userId) && id.equals(userName)){
			System.out.println("Valid user");
		}
		else
			System.out.println("Invalid user");
		sc.close();
	
	}

}

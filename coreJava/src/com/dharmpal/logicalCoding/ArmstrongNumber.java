package com.dharmpal.logicalCoding;

public class ArmstrongNumber {
	public static int checkArmstrong(int n) {
		int temp = n, rem = 0;
		int arm = 0;
		int count = 0;
		while (temp > 0) {
			count++;
			temp = temp / 10;
		}

		temp = n;
		while (temp > 0) {
			rem = temp % 10;
			arm = arm + power(count, rem);
			temp = temp / 10;
		}

		return arm;
	}

	public static int power(int count, int rem) {
		int arm = 1;
		for (int i = 0; i < count; i++) {
			arm = arm * rem;
		}
		return arm;
	}

	public static void main(String[] args) {
		int num = 153;
		int arm = checkArmstrong(num);
		if (arm == num) {
			System.out.println("Given number " + num + " is armstrong number");
		} else
			System.out.println("Given number " + num + " is not armstrong number");

	}

}

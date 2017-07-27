package com.dharmpal.logicalCoding;

import java.util.Arrays;

public class FibonacciNumber {
	
	public static int[] fibonacciSeries(int intial, int length) {
		int len = length - intial + 1;
		int[] arr = new int[len];
		arr[0] = intial;
		arr[1] = ++intial;
		int n1 = arr[0];
		int n2 = arr[1];
		for (int i = 2; i < len; i++) {
			int n = n1 + n2;
			arr[i] = n;
			n1 = n2;
			n2 = n;
		}
		return arr;
	}

	public static void main(String[] args) {
		int intial = 5;
		int length = 10;
		System.out.println(Arrays.toString(fibonacciSeries(intial, length)));
	}

}

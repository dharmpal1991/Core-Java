package com.dharmpal.arrays;

import java.util.Arrays;

public class ReverseElementOfArray {
	public static int[] reverseArray(int[] arr) {
		int temp = 0;
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] array = { 2, 3, 4, 5, 6, 7, 7, 8, 89, 59 };
		System.out.println(Arrays.toString(reverseArray(array)));
	}


}

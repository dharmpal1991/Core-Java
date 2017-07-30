package com.dharmpal.sorting;

import java.util.Arrays;

public class Bubble {
	public static void main(String[] args) {
		int temp;
		int arr[] = { 5, 10, 4, 2, 99, 36, 1, 2, 0 };
		System.out.println("Given array in acending sorting...");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}

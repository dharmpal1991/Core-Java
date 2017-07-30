package com.dharmpal.sorting;

import java.util.Arrays;

public class Selection {
	public static void main(String[] args) {
		int temp;
		int arr[] = { 90, 28, 35, 10, 9, 6, 89, 99, 1 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted array is....");
		System.out.println(Arrays.toString(arr));
	}

}

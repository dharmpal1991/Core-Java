package com.dharmpal.sorting;

import java.util.Arrays;

public class Insertion {
	public static void main(String[] args) {
		int j, num;
		int arr[] = { 5, 2, 9, 20, 1, 3, 55, -1, 2, 0 };
		for (int i = 1; i < arr.length; i++) {
			num = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > num; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = num;
		}
		System.out.println("By the use of insertion sorting given array in sorting....");
		System.out.println(Arrays.toString(arr));
	}

}

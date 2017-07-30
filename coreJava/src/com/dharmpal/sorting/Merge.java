package com.dharmpal.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(".......Merge sort testing.......");
		System.out.println("*******************************");
		System.out.println("Enter integer number whatever you want means length of array.... ");
		n = sc.nextInt();

		/* Make array of n elements */
		int arr[] = new int[n];
		System.out.println("Enter " + n + " integer elements..");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		/* Call method sort */
		doSorting(arr);
		System.out.println("-----------------------------------");
		System.out.println("......Sorting array.......");
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	public static void doSorting(int arr[]) {
		int len = arr.length - 1;
		merge_sort(arr, 0, len);
	}

	public static void merge_sort(int arr[], int low, int high) {
		if (low != high) {
			int mid = (low + high) / 2;
			merge_sort(arr, low, mid);
			merge_sort(arr, mid + 1, high);
			mergePartOfArray(arr, low, mid, high);
		}
	}

	public static void mergePartOfArray(int arr[], int low, int mid, int high) {
		int temp[] = new int[n];

		int i = low;
		int j = mid + 1;
		int k = low;
		while ((i <= mid) && (j <= high)) {
			if (arr[i] <= arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];
		}
		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		while (j <= high) {
			temp[k++] = arr[j++];
		}
		for (i = low; i <= high; i++) {
			arr[i] = temp[i];
		}
	}

}

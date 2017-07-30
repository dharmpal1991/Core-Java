package com.dharmpal.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Quick {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println(".......Quick sort testing.......");
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
		quickSort(arr, 0, arr.length - 1);
		System.out.println("-----------------------------------");
		System.out.println("......Sorting array.......");
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

	private static void quickSort(int[] arr, int p, int r) {
		if (p < r) {
			int q = partition(arr, p, r);
			quickSort(arr, p, q - 1);
			quickSort(arr, q + 1, r);
		}
	}

	private static int partition(int[] arr, int p, int r) {
		int pivote = arr[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (arr[j] <= pivote) {
				i++;
				swap(arr, i, j);
			}
		}

		swap(arr, r, i + 1);
		return i + 1;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}

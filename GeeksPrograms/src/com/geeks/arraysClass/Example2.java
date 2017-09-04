package com.geeks.arraysClass;

import java.util.Arrays;

public class Example2 {
	public static void main(String[] args) {
		int arr[] = { 4, 6, 1, 8, 3, 9, 7, 4, 2 };
		Arrays.sort(arr, 0, 5);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// binary search method only work when array is sorted.
		// return position of index if found other wise return negative value.
		int index = Arrays.binarySearch(arr, 6);
		System.out.println(index);

		// copy all Array
		int[] copy = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(copy));

		// copy specified range of array.
		int[] rangeCopy = Arrays.copyOfRange(arr, 3, 8);
		System.out.println(Arrays.toString(rangeCopy));

		// fill 10 in array index 0 to 5.
		Arrays.fill(arr, 0, 5, 10);
		System.out.println(Arrays.toString(arr));

		// fill 15 in full array.
		Arrays.fill(arr, 15);
		System.out.println(Arrays.toString(arr));
	}
}

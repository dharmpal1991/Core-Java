package com.dharmpal.arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DeleteDublicateElementFromArray {
	public static Set<Integer> uniqueNumberArray1(String arr) {
		String[] str = arr.split("\\,");
		@SuppressWarnings({ "unchecked", "rawtypes" })
		Set<Integer> set = new LinkedHashSet(Arrays.asList(str));
		return set;
	}

	public static String[] uniqueNumberArray2(String arr) {
		String[] str = arr.split("\\,");
		int len = str.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				int n1 = Integer.parseInt(str[i]);
				int n2 = Integer.parseInt(str[j]);
				if (n1 == n2) {
					str[j] = str[len - 1];
					--len;
					--j;
				}
			}
		}
		for (int i = 0; i < len; i++) {
			System.out.print(str[i] + " ");

		}
		return str;
	}

	public static void main(String[] args) {
		String s = "10,1,3,6,6,6,9,7,6,6,5";
		System.out.println("Without dublicate numbers......using Collection api");
		System.out.println(uniqueNumberArray1(s).toString());
		System.out.println("************************************************");
		System.out.println("Without dublicate numbers........... using predife api");
		uniqueNumberArray2(s);
	}

}

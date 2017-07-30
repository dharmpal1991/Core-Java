package com.dharmpal.arrays;

import java.util.Arrays;

public class SortArrayOfString {
	public static String[] sorting(String arr) {
		String[] str = arr.split(" ");
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				/*
				 * if you want decending order then you replace > sign with <
				 * sign so your order of sorting will become decending
				 */
				String temp = null;
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		return str;
	}

	public static void main(String[] args) {
		String str = "deepak dyna deepali deepika deksha dileep dee";
		System.out.println(Arrays.toString(sorting(str)));

	}

}

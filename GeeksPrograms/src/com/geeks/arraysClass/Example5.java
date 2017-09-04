package com.geeks.arraysClass;

import java.util.Arrays;
import java.util.Collections;

public class Example5 {
	public static void main(String[] args) {
		int [] a = {9,3,5,4,6,8,7};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int [] b = {13,9,5,8,11,15};
		Arrays.sort(b,1,3);
		System.out.println(Arrays.toString(b));
		
		Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
		String[] str = {"d","f","z","t","u"};
		Arrays.sort(str,Collections.reverseOrder());
		System.out.println(Arrays.toString(str));
	}

}

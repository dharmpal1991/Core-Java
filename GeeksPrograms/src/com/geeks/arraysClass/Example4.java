package com.geeks.arraysClass;

import java.util.Arrays;

public class Example4 {
	public static void main(String[] args) {
		int [] i = {2,3,4,56,7,9,10};
		System.out.println(Arrays.toString(i));
		
		// deeptoString method used for printing two dimensional Arrays
		int [][] arr = new int [2][2];
		arr[0][0] = 30;
		arr[0][1] = 90;
		arr[1][0] = 20;
		arr[1][1] = 60;
		System.out.println(Arrays.deepToString(arr));
		
		int [][] array = new int [3][4];
		 for(int [] row : array){
			 Arrays.fill(row, 100);
		 }
		 System.out.println(Arrays.deepToString(array));
	}

}

package com.logic;

public class SumofArrayElements {
	public static void main(String[] args) {
		int[] a = {10,20,30,50,33,60,345};
		int sum=0;
		for(int arr :a){
			sum = sum+arr;
		}
		System.out.println(sum);
	}

}

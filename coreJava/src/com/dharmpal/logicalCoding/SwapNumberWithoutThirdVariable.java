package com.dharmpal.logicalCoding;

public class SwapNumberWithoutThirdVariable {
	public static void swap1(int n1 ,int n2){
		n1 = n1+n2;
		n2 = n1-n2;
		n1 = n1-n2;
		System.out.println(n1);
		System.out.println(n2);
	}
	public static void main(String[] args) {
		int n1 = 30;
		int n2 = 40;
		swap1(n1,n2);
	}

}

package com.dharmpal.logicalCoding;

public class BiggestAmongThreeNumber {
	public static int biggestNumber(int n1, int n2, int n3) {
		int biggest = 0;
		biggest = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
		return biggest;
	}

	public static void main(String[] args) {
		int n1 = 60;
		int n2 = 50;
		int n3 = 89;
		System.out.println("BIggest Number Among Three Numbers :"
				+ biggestNumber(n1, n2, n3));
	}
}

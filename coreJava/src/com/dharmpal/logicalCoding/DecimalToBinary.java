package com.dharmpal.logicalCoding;

public class DecimalToBinary {
	public static String conversionDecimalToBinary(int decimal) {
		int temp = decimal;
		int remender = 0;
		String str = "";
		while (temp > 0) {
			remender = temp % 2;
			str = remender + str;
			temp = temp / 2;
		}
		return str;
	}

	public static void main(String[] args) {
		int decimal = 450;
		System.out.println("Decimal" + decimal + " == "
				+ conversionDecimalToBinary(decimal));
	}

}

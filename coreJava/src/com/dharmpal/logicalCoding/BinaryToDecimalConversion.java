package com.dharmpal.logicalCoding;

public class BinaryToDecimalConversion {
	public static long conversionBinaryToDecimal(long binary) {
		long temp = binary, decimal = 0, decimalPower = 1;
		while (temp > 0) {
			long remender = temp % 10;
			decimal = decimal + decimalPower * remender;
			decimalPower = decimalPower * 2;
			temp = temp / 10;
		}
		return decimal;
	}

	public static void main(String[] args) {
		long binary = 111000010;
		System.out.println("BInary Number" + binary + " == "
				+ conversionBinaryToDecimal(binary));
	}
}

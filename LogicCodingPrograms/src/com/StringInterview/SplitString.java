package com.StringInterview;

public class SplitString {
	public static void main(String[] args) {
		String str = "instance.of.java";
		String strarray[] = str.split("\\.");

		for (int i = 0; i < strarray.length; i++) {
			System.out.print(strarray[i]);
		}
	}

}

package com.dharmpal.StringQuestion;

public class ReverseString {

	/* 1:- By getBytes() method of String Class */
	public static void reverseString1(String s) {
		byte[] b = s.getBytes();
		for (int i = 0, j = b.length - 1; i < j; i++, j--) {
			byte temp;
			temp = b[i];
			b[i] = b[j];
			b[j] = temp;

		}
		System.out.println(new String(b));
	}

	/* 2:- By reverse() method of StringBuffer Class */
	public static void reverseString2(String s) {
		StringBuffer input = new StringBuffer();
		input.append(s);
		input = input.reverse();
		System.out.println(input);
	}

	/* 3:- By charAt() method of String Class */
	public static void reverseString3(String s) {
		String revString = "";
		for (int j = s.length() - 1; j >= 0; j--) {
			revString = revString + s.charAt(j);
		}
		System.out.println("Reverse String = " + revString);
	}

	public static void main(String[] args) {
		String s = "deepakmishra";
		System.out.println("1:- By getBytes() method of String Class");
		reverseString1(s);
		System.out.println("****************************************");
		System.out.println("2:- By reverse() method of StringBuffer Class");
		reverseString2(s);
		System.out.println("********************************");
		System.out.println("3:- By charAt() method of String Class");
		reverseString3(s);

	}

}

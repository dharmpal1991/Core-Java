package com.StringInterview;


public class CharPastAtEndOfArray {
	public static String str = "";
	public static String str1 = "";
	public static String str2 = "";

	public static String ModifyString1(String s, int n) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(n) != s.charAt(i))
				str = str + s.charAt(i);
		}
		return str + s.charAt(n);
	}

	public static String ModifyString2(String s, char c) {
		String str21 = "";
		String str22 = "";
		for (int i = 0; i < s.length(); i++) {
			if (c != s.charAt(i))
				str21 = str21 + s.charAt(i);
			else
				str22 = str22 + c;
		}
		str1 = str21 + str22;
		return str1;
	}

	@SuppressWarnings("unused")
	public static String ModifyString3(String s, char c) {
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			if (flag = true || c != s.charAt(i))
				str2 = str2 + s.charAt(i);
			else
				flag = true;
		}
		return str2 + c;
	}

	public static void main(String[] args) {
		System.out.println("char past at end of String by given index:");
		String s1 = ModifyString1("ramcharnder", 4);
		System.out.println(s1);
		System.out.println("***********************************************");
		System.out.println("char past at end of String by given character:");
		String s2 = ModifyString2("ramcharnder", 'a');
		System.out.println(s2);
		System.out.println("***********************************************");
		System.out.println("char past at end of String by given character:");
		String s3 = ModifyString3("ramcharnder", 'a');
		System.out.println(s3);

	}
}

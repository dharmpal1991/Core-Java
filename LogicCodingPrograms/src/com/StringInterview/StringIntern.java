package com.StringInterview;

public class StringIntern {
	public static void main(String[] args) {
		String s = "dharmpal";
		String s1 = new String("dharmpal");
		System.out.println("s :"+s.hashCode());
		System.out.println("s1 :"+s.hashCode());
		
		System.out.println(s1.intern() == s.intern());
		System.out.println(s.equals(s1));
	}

}

package com.StringInterview;

public class ImmutableClass {
	private String str;

	public ImmutableClass(String str) {
		this.str = str;
		System.out.println(str);
	}

	public ImmutableClass setStr(String str) {
		if (this.str == str) {
			return this;
		} else
			return new ImmutableClass(str);

	}

	public static void main(String[] args) {
		ImmutableClass im = new ImmutableClass("dharmpal");
		im.setStr("dharmpal");

	}

}

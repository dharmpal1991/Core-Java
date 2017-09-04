package com.geeks.method;

public class TestClass implements TestInterface {

	@Override
	public void squre(int a) {
		System.out.println(a * a);
	}

	public static void main(String[] args) {
		TestClass t = new TestClass();
		t.squre(10);
		t.show();
	}
}

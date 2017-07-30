package com.dharmpal.java8Features;

interface A {
	void show(int i);
}
public class LabdaDemo {
	public static void main(String[] args) {
		A obj;
		// obj=new A()
		/*
		 * { public void show() { System.out.println("Hi..."); } };
		 */
		obj = (i) -> System.out.println("me..." + i);// Lambda Expression//
														// consumer interface

		obj.show(6);
	}

}

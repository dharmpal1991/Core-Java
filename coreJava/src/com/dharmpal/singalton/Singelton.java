package com.dharmpal.singalton;

public class Singelton {
	private static Singelton singleInstance;

	private Singelton() {
	}

	public static Singelton getSingleInstance() {
		if (singleInstance == null) {
			// System.out.println("inside 1 if");
			synchronized (Singelton.class) {
				if (singleInstance == null) {
					// System.out.println("inside 2 if");
					singleInstance = new Singelton();
					// System.out.println(singleInstance);
				}
			}
		}
		return singleInstance;
	}

	public void fun() {
		System.out.println("fun  " + singleInstance);
		System.out.println("Deepak");
	}

	public void foo() {
		System.out.println("foo  " + singleInstance);
		System.out.println("Mishra");

	}

	public static void main(String[] args) {
		// Singelton1 singleInstance=new Singelton1();
		// System.out.println(singleInstance);
		getSingleInstance().fun();
		getSingleInstance().foo();
		// singleInstance.fun();
		// singleInstance.foo();
	}

}

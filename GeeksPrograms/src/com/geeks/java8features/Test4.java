package com.geeks.java8features;

public class Test4 {
	public static void m1(){
		for(int i =0;i<5;i++){
			System.out.println("Child Thread");
		}
	}
	public static void main(String[] args) {
		Runnable r = Test4::m1;
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<5;i++){
			System.out.println("Main Thread");
		}
	}

}

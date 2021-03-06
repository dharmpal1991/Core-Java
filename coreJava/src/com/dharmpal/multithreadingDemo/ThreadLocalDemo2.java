package com.dharmpal.multithreadingDemo;

public class ThreadLocalDemo2 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ThreadLocal l1 = new ThreadLocal() {
			public Object initialValue() {
				return "abc";
			}
		};
		System.out.println(l1.get());
		l1.set("deepak");
		System.out.println(l1.get());
		l1.remove();
		System.out.println(l1.get());
	}

}

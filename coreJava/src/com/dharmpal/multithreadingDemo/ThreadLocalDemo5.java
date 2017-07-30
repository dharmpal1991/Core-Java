package com.dharmpal.multithreadingDemo;

class ParentThread1 extends Thread {
	@SuppressWarnings("rawtypes")
	public static InheritableThreadLocal l1 = new InheritableThreadLocal() {
		public Object childValue(Object p) {
			return "CC";
		}
	};

	@SuppressWarnings("unchecked")
	public void run() {
		l1.set("PT");
		System.out.println("ParentThread1 value--" + l1.get());
		ChildThread1 ct = new ChildThread1();
		ct.start();

	}
}

class ChildThread1 extends Thread {

	public void run() {
		System.out.println("ChildThread1 value--" + ParentThread1.l1.get());
	}
}

public class ThreadLocalDemo5 {
	public static void main(String[] args) {
		ParentThread1 pt = new ParentThread1();
		pt.start();
	}

}

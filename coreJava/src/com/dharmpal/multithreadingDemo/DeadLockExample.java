package com.dharmpal.multithreadingDemo;

class Test1 {
	public synchronized void test1(Test2 t2) {
		System.out.println("Thread 1 start to execution");
		t2.fun2();
	}

	public synchronized void fun1() {
		System.out.println("fun1 Method is exectued");
	}
}

class Test2 {
	public synchronized void test2(Test1 t1) {
		System.out.println("Thread 2 start to execution");
		t1.fun1();
	}

	public synchronized void fun2() {
		System.out.println("fun2 Method is exectued");
	}
}

public class DeadLockExample extends Thread {
	Test1 t1 = new Test1();
	Test2 t2 = new Test2();

	public void driver() {
		this.start();
		t1.test1(t2);
	}

	public void run() {
		t2.test2(t1);
	}

	public static void main(String[] args) {
		DeadLockExample d = new DeadLockExample();
		d.driver();
	}

}

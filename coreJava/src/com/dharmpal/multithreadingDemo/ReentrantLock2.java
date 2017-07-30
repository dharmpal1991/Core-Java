package com.dharmpal.multithreadingDemo;

import java.util.concurrent.locks.ReentrantLock;

class Yahoo extends Thread {
	ReentrantLock l = new ReentrantLock();

	public String name;

	Yahoo(String name) {
		this.name = name;
	}

	public void run() {
		wish(name);
	}

	public void wish(String name) {
		l.lock();
		for (int i = 0; i < 5; i++) {
			System.out.print("GoodMorning  : ");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
		l.unlock();
	}
}

public class ReentrantLock2 {
	public static void main(String[] args) {
		Yahoo t1 = new Yahoo("Deepak");
		Yahoo t2 = new Yahoo("Ankit");
		t1.start();
		t2.start();
	}

}

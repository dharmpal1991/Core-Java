package com.dharmpal.multithreadingDemo;

class MyThread4 extends Thread {
	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
			this.notify();
		}
	}
}

public class WaitAndNotifyDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread4 t = new MyThread4();
		t.start();
		t.setPriority(10);
		synchronized (t) {
			t.wait();
			for(int i = 0;i<10;i++){
				if(i%2 !=0){
					System.out.println(i);
				}
			}
			
		}
	}
}

package com.dharmpal.multithreadingDemo;

class MyThread extends Thread{
	public void run(){
		for(int i = 1;i<=10;i++){
			if(i%2 == 0){
				System.out.println(i + " BY MyThread");
			}
		}
	}
}
class MyThread1 extends Thread{
	public void run(){
		for(int i = 1;i<=10;i++){
			if(i%2 != 0){
				System.out.println(i + " BY MyThread-1");
			}
		}
	}
}
public class YieldDemo {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		MyThread t = new MyThread();
		MyThread1 t1 = new MyThread1();
		t1.start();
		t.start();
		t1.yield();

		}
}

package com.dharmpal.multithreadingDemo;

class MyThread2 extends Thread{
	public void run(){
		for(int i = 1;i<=10;i++){
			if(i%2 == 0){
				System.out.println(i);
			}
		}
	}
}
class MyThread3 extends Thread{
	public void run(){
		for(int i = 1;i<=10;i++){
			if(i%2 != 0){
				System.out.println(i);
			}
		}
	}
}
public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread2 t = new MyThread2();
		MyThread3 t1 = new MyThread3();
		t.start();
		t1.join();
		t1.start();
	}

}

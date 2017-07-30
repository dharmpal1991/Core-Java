package com.dharmpal.interviewQuestion;
class Newthread extends Thread {
	Thread t;
	String name;

	Newthread(String threadname) {
		this.name = threadname;
		t = new Thread(this, name);
		t.start();

	}

	public void run() {
		System.out.println("done");
	}
}

public class IDC9 {
	public static void main(String[] args) {
		Newthread obj1 = new Newthread("one");
		try {
			System.out.println("first");

			obj1.t.wait();
			System.out.print("obj1.t.isAlive()" + " Ok");

		} catch (Exception e) {
			System.out.println("Main thrad interrupted");
		}
	}


}

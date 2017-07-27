package com.dharmpal.multithreadingDemo;

class Buffer{
	int data;
	boolean produced = false;
	synchronized void produce(int i) throws InterruptedException{
		if(produced){
			System.out.println("Producer is waiting");
			wait();
		}
		data = i;
		System.out.println(" data "+ data +" is produced");
		produced = true;
		notify();
	}
	synchronized void consume() throws InterruptedException{
		if(!produced){
			System.out.println("Consumer is waiting");
			wait();
		}
		System.out.println(" data "+ data +" is consumed");
		produced = false;
		notify();
	}
}
class Consumer extends Thread{
	Buffer b;
	Consumer(Buffer b){
		this.b = b;
	}
	public void run(){
		for(int i = 1;i<=5;i++){
			try{
				b.consume();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
class Producer extends Thread{
	Buffer b;
	Producer(Buffer b){
		this.b = b;
	}
	public void run(){
		for(int i = 1;i<=5;i++){
			try{
				b.produce(i);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
public class ProducerConsumerProblem {
	public static void main(String[] args) {
		Buffer b = new Buffer();
		Producer p = new Producer(b);
		Consumer c = new Consumer(b);
		p.start();
		c.start();
	}

}

package com.dharmpal.ioPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient final int i = 30;
	int j = 50;
}

public class SerilizableDemo {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		Dog d = new Dog();
		System.out.println("Serialization started");
		FileOutputStream fos = new FileOutputStream("test.ser");
		@SuppressWarnings("resource")
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);

		System.out.println("*******************************");

		System.out.println("Deserilization Started");

		FileInputStream fis = new FileInputStream("test.ser");
		@SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d1 = (Dog) ois.readObject();
		System.out.println(d1.i + "------" + d1.j);
	}
}

package com.dharmpal.ioPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String userName = "Dharmpal";
	transient String password = "dkkkk";


	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		String pass = "123" + password;
		oos.writeObject(pass);
	}

	private void readObject(ObjectInputStream ois) throws IOException,
			ClassNotFoundException {
		ois.defaultReadObject();
		String pass = (String) ois.readObject();
		pass = pass.substring(3);
	}
}

public class CustomizedSerilizationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account ac = new Account();
		System.out.println(ac.userName+"======"+ac.password);
		System.out.println("Start Serialization");
		FileOutputStream fos = new FileOutputStream("demo.txt");
		@SuppressWarnings("resource")
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ac);
		System.out.println("start Deserialization");
		FileInputStream fis =new FileInputStream("demo.txt");
		@SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account acc = (Account)ois.readObject();
		System.out.println(acc.userName+"======="+ac.password);
		
		
		
	}

}

package com.dharmpal.ioPackage;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Account1 implements Externalizable {
	String userName = "dkansujia";
	String password = "yahooo";

	public Account1() {
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		String pass = "1234" + password;
		out.writeObject(pass);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		String pwd = (String) in.readObject();
		password = pwd.substring(3);

	}
}

public class ExternalizableDemo {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		Account1 ac = new Account1();
		System.out.println(ac.userName + "======" + ac.password);
		System.out.println("Start Serialization");
		FileOutputStream fos = new FileOutputStream("demo.txt");
		@SuppressWarnings("resource")
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ac);
		System.out.println("start Deserialization");
		FileInputStream fis = new FileInputStream("demo.txt");
		@SuppressWarnings("resource")
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account1 acc = (Account1) ois.readObject();
		System.out.println(acc.userName + "=======" + ac.password);
	}

}

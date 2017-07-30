package com.dharmpal.ioPackage;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("dk.txt");
		int i = fr.read(); // more amount of data
		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();
		}
	}

}

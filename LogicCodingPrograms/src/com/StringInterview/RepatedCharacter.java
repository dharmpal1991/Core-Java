package com.StringInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepatedCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.next();
		char[] c = str.toCharArray();
		List<Character> list = new ArrayList<>();
		int count;
		for (int i = 0; i < c.length; i++) {
			count = 1;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
				}
			}
			if (count > 1 && !list.contains(c[i])) {
				System.out.println(c[i] + "==" + count);
				list.add(c[i]);
			}
			if (count == 1 && !list.contains(c[i])) {
				System.out.println(c[i] + "==1");
			}
			sc.close();
		}
	}

}

package com.geeks.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test7 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("dharmpal");
		l.add("kansujia");
		l.add("dudi");
		l.add("ram");
		l.add("sham");
		System.out.println(l);
		List<String> l1 = l.stream().map(s ->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l1);
	}

}

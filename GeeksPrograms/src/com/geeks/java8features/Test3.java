package com.geeks.java8features;

import java.util.function.Function;

public class Test3 {
	public static void main(String[] args) {
		
		// Function is used for opertion and return some result
		// apply is method present on Function interface
		// it contain two arguments first for argument type and second for return type
		
		Function<String,Integer> f = s ->s.length();
		System.out.println(f.apply("dharmpal"));
		System.out.println(f.apply("kansujia"));
	}

}

package com.geeks.operators;

public class Operators5 {
	public static void main(String[] args) {
		int a = 20,b = 10,c = 30,result,result1;
		
		result = ((a>b)?(a>c)?a:c:(b>c)?b:c);
		System.out.println("Max of three numbers = "+result);
		
		result1 = ((a<b)?(a<c)?a:c:(b<c)?b:c);
		System.out.println("Min of three numbers = "+result1);
	}

}

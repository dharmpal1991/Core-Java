package com.dharmpal.logicalPattern;

public class Pattern3 {
	public static void main(String[] args) {
		for(int i =0;i<=9;i++){
			for(int j =1;j<=9-i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

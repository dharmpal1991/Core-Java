package com.dharmpal.logicalPattern;

public class Pattern4 {
	public static void main(String[] args) {
		int k = 9;
		for(int i = 0;i<=9;i++){
			for(int j=1;j<=k;j++){
				System.out.print(k);
			}
			--k;
			System.out.println();
		}
	}
}

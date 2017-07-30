package com.dharmpal.logicalPattern;

/*  88888888
	7777777
	666666
	55555
	4444
	333
	22
    1  */

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

package com.dharmpal.logicalPattern;

/* Result in this pattern
1
22
333
4444
55555
666666
7777777
88888888
999999999*/

public class pattern1 {
	public static void main(String[] args) {
		for(int i =1;i<=9;i++){
			for(int j =1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

package com.geeks.method;

import java.util.Scanner;

public class AddTwoMatrix {
	public static void main(String[] args) {
		int i ,j ,row ,col;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  row Matrix:");
		row = sc.nextInt();
		System.out.println("Enter the  col Matrix");
		col = sc.nextInt();
		
		int [][] a = new int [row][col];
		int [][] b = new int [row][col];
		int [][] c = new int [row][col];
		
		System.out.println("Enter the First Matrix :");
			for(i = 0;i<row;i++){
				for(j =0 ;j<col;j++){
					a[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Enter the Second Matrix :");
				for(i = 0;i<row;i++){
					for(j=0;j<col;j++){
						b[i][j] = sc.nextInt();
					}
				}
				for(i =0;i<row;i++){
					for(j=0;j<col;j++){
						c[i][j] = a[i][j]+b[i][j];
					}
				}
				System.out.println("Sum of two Matrix :");
					for(i = 0;i<row;i++){
						for(j=0;j<col;j++){
							System.out.print(c[i][j]+" ");
						}
						System.out.println();
					}
				sc.close();
		
	}

}

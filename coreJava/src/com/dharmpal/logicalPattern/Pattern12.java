package com.dharmpal.logicalPattern;

public class Pattern12 {
	public static void main(String[] args) {
		  
		 /*  1 2 3 4 5 6 7 8 
			  1 2 3 4 5 6 7 
			   1 2 3 4 5 6 
			    1 2 3 4 5 
			     1 2 3 4 
			      1 2 3 
			       1 2 
			        1 */
			
			int r, c1,c2;
			 
			for (r = 1; r <= 10; r++) {
			 
			for (c1 = 1; c1 <r; c1++) {
			  System.out.print(" ");
			}
			 
			for (c2 = 1; c2 <= 10 - r; c2++) {
			    System.out.print(c2 + " ");
			}
			 
			System.out.println("");
			}
			 
	}

}

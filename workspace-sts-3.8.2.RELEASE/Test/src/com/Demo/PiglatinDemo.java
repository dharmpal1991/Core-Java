package com.Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PiglatinDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Word:");
		String s = br.readLine();
		s = s.toUpperCase();
		int l = s.length();
		char ch;
		 int position = -1;
		 for(int i = 0;i<l;i++){
			 ch = s.charAt(i);
			 if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				 position = i;
				 break;
			 }
		 }
		 if(position!= -1){
			 String a = s.substring(position);
			 String b = s.substring(0, position);
			 String piglatin = a+b+"AY";
			 System.out.println(piglatin);
		 }
		 else 
			 System.out.println("No Vowal so piglatin is not possible:");
	}

}

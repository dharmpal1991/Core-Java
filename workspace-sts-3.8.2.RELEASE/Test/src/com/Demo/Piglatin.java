package com.Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Piglatin {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the word:");
		String s = br.readLine();
		s = s.toUpperCase();
		int l = s.length();
		int position = -1;
		char ch;
		for(int i =0;i<l;i++){
			ch = s.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			position = i;
			break;
			}	
		}
		if(position!= -1){
			String a = s.substring(position);
			String b = s.substring(0,position);
			String pig = a+b+"AY";
			System.out.println(pig);
		}
		else
			System.out.println("No Vowal Hence Piglatin not possible");
		
	}

}

package com.dharmpal.StringQuestion;

public class StringSorting {
	public static String stringSorting(String str){
		char[] ch = str.toCharArray();
		for(int i =0;i<ch.length;i++){
			for(int j = i+1;j<ch.length;j++){
				if(ch[i] <ch[j]){
					char temp = ch[i];
					ch[i] =  ch[j];
					ch[j] = temp;
				}
			}
			
		}
		return String.valueOf(ch);
	}
	public static void main(String[] args) {
		String str = "ladygaga";
		System.out.println(stringSorting(str));
	}

}

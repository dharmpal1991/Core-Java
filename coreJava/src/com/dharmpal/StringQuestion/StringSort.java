package com.dharmpal.StringQuestion;

public class StringSort {
	public static String strSort(String str)
	{
	   char[] ch=str.toCharArray();
	   for(int i=0;i<ch.length;i++)
	   {
		   for(int j=i+1;j<ch.length;j++)
		   {
			   if(ch[i]<ch[j])
			   {
				   char temp=ch[i];
				   ch[i]=ch[j];
				   ch[j]=temp;
			   }
		   }
	   }
	   return String.valueOf(ch);
	}
	public static void main(String[] args) {
		String str="sexyLady";
		System.out.println("Your String :: "+str+" == "+strSort(str));
	}

}

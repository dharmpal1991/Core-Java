package com.geeks.java8features;

interface inter{
	public  void sum(int a,int b);
}

public class Test1 implements inter{
	public static void main(String[] args) {
		inter i = (a,b) -> System.out.println(a+b);
		i.sum(20, 30);
		
	}

	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		
	}

}

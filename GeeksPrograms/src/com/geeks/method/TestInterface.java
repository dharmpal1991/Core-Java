package com.geeks.method;

public interface TestInterface {
	public void squre(int a);
	
	default void show(){
		System.out.println("Default Method inside Interface");
	}
}


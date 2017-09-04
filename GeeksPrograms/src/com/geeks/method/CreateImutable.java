package com.geeks.method;

final class CreateImutable {
	private int i;
	public CreateImutable(int i) {
		this.i = i;
	}
	public CreateImutable modify(int i){
		if(this.i == i)
			return this;
		else
			return (new CreateImutable(i));
	}
	public static void main(String[] args) {
		CreateImutable c = new CreateImutable(10);
		CreateImutable c1 = c.modify(100);
		CreateImutable c2 = c.modify(10);
		System.out.println(c == c1);
		System.out.println(c == c2);
		CreateImutable c3 = c1.modify(100);
		System.out.println(c1 == c3);
		
	}
	

}

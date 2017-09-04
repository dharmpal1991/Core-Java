package com.geeks.method;

public class Singalton {
	private static Singalton s = null;
	private Singalton(){
	}
	public static Singalton getSingalton(){
		if(s == null){
			s = new Singalton();
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println(Singalton.getSingalton().hashCode());
		System.out.println(Singalton.getSingalton().hashCode());
		System.out.println(Singalton.getSingalton().hashCode());
	}

}

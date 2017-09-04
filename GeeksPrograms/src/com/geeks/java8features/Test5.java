package com.geeks.java8features;

class Sample{
	@SuppressWarnings("unused")
	private String s;
	Sample(String s){
		this.s = s;
		System.out.println("Constructor Executed:"+s);
	}
}
interface interf{
	public Sample get(String s);
}
public class Test5 {
	public static void main(String[] args) {
		interf f = s -> new Sample(s);
		f.get("From Lambda Expersion");
		interf f1 = Sample::new;
		f1.get("From Constructor Reference");
	}

}

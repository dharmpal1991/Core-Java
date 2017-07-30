package com.dharmpal.logicalCoding;
class Test1 {
	int num, model;

	Test1(int num, int model) {
		this.num = num;
		this.model = model;
	}
}

public class SwapObject {
	public static void swap(Test1 t1, Test1 t2) {
		Test1 temp = t1;
		t1 = t2;
		t2 = temp;
	}

	// Driver method
	public static void main(String[] args) {
		Test1 t1 = new Test1(1, 101);
		Test1 t2 = new Test1(2, 202);
		swap(t1, t2);
		System.out.println("t1 : " + t1.num + " , " + t1.model);
		System.out.println("t2 : " + t2.num + " , " + t2.model);
	}

}

package com.dharmpal.StringQuestion;

final class Student {
	final private String name;
	final private int rollNo;

	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

}

public class MyImmutable {
	public static void main(String[] args) {
		Student st = new Student("deepak", 111);
		System.out.println(st.getName());
		System.out.println(st.getRollNo());
	}


}

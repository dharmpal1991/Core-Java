package com.dharmpal.collection;

import java.util.HashMap;


class Student {
	public Integer id;
	public Student(Integer id) {
		this.id = id;
	}
	public String toString(){
		return  " id = "+id+ " ";
	}
	public void finalize(){
		System.out.println("Fizalize Method is Called");
	}
}
public class HashMapDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		HashMap map = new HashMap();
		Student emp1 = new Student(111);
		Student emp2 = new Student(222);
		Student emp3 = new Student(333);
		map.put(emp1, "Dharmpal");
		map.put(emp2, "Kansujia");
		map.put(emp3, "Jhon");
		System.out.println(map);
		emp1 = null;
		System.gc();
	}


}

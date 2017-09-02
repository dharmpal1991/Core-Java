package com.dharmpal.collection;

import java.util.WeakHashMap;

class Employee {
	public Integer id;
	public Employee(Integer id) {
		this.id = id;
	}
	public String toString(){
		return  " id = "+id+ " ";
	}
	public void finalize(){
		System.out.println("Fizalize Method is Called");
	}
}

public class WeekHashMapDemo {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		WeakHashMap map = new WeakHashMap();
		Employee emp1 = new Employee(111);
		Employee emp2 = new Employee(222);
		Employee emp3 = new Employee(333);
		map.put(emp1, "Dharmpal");
		map.put(emp2, "Kansujia");
		map.put(emp3, "Jhon");
		System.out.println(map);
		emp1 = null;
		System.gc();
	}

}

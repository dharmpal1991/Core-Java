package com.dharmpal.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Employee2{
	private Long empId;
	private String empName;
	
	public Long getEmpId(){
		return empId;
	}
	public void setEmpId(Long empId){
		this.empId = empId;
	}
	public String getEmpName(){
		return empName;
	}
	public void setEmpId(String empName){
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	public Employee2(Long empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}	
}
class EmployeeDetails2{
	private Long empId;
	private String empEmail;
	private int salary;
	private int age;
	private String city;
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [empId=" + empId + ", empEmail=" + empEmail
				+ ", salary=" + salary + ", age=" + age + ", city=" + city
				+ "]";
	}
	public EmployeeDetails2(Long empId, String empEmail, int salary, int age,
			String city) {
		super();
		this.empId = empId;
		this.empEmail = empEmail;
		this.salary = salary;
		this.age = age;
		this.city = city;
	}
}
public class MapSortByValueWithComparator {
	public static void main(String[] args) {
		Employee2 emp1 = new Employee2(new Long(444),"Dharmpal");
		Employee2 emp2 = new Employee2(new Long(222),"kansujia");
		Employee2 emp3 = new Employee2(new Long(111),"Sunil");
		Employee2 emp4 = new Employee2(new Long(555),"Deepak");
		Employee2 emp5 = new Employee2(new Long(333),"Rahul");
		
		EmployeeDetails2 empDt1 = new EmployeeDetails2(new Long(222), "dharmpal@gmail.com", 50000, 26, "fazilka");
		EmployeeDetails2 empDt2 = new EmployeeDetails2(new Long(222), "kansujia@gmail.com", 45000, 27, "ferozepur");
		EmployeeDetails2 empDt3 = new EmployeeDetails2(new Long(222), "kansujia@gmail.com", 35000, 29, "abohar");
		EmployeeDetails2 empDt4 = new EmployeeDetails2(new Long(222), "deepak@gmail.com", 65000, 25, "lucknow");
		EmployeeDetails2 empDt5 = new EmployeeDetails2(new Long(222), "rahul@gmail.com", 35000, 28, "punjab");
		Map<Employee2,EmployeeDetails2> unMap = new HashMap<>();
		unMap.put(emp1, empDt1);
		unMap.put(emp2, empDt2);
		unMap.put(emp3, empDt3);
		unMap.put(emp4, empDt4);
		unMap.put(emp5, empDt5);
		System.out.println("------------------UnSortedMap------------------");
		printMap(unMap);
		System.out.println("***********************************************");
		System.out.println("--------------SortedMap By Values--------------");
		List<Map.Entry<Employee2, EmployeeDetails2>> list =  new LinkedList<Map.Entry<Employee2,EmployeeDetails2>>(unMap.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<Employee2, EmployeeDetails2>>(){

			@Override
			public int compare(Entry<Employee2, EmployeeDetails2> emp1,Entry<Employee2, EmployeeDetails2> emp2) {
				int i = (int)(emp1.getValue().getEmpId() - emp2.getValue().getEmpId());
				if(i == 0)
					i = emp1.getValue().getEmpEmail().compareTo(emp2.getValue().getEmpEmail());
				if(i == 0)
					i = emp1.getValue().getAge() - emp2.getValue().getAge();
				if(i == 0)
					i = emp1.getValue().getSalary() - emp2.getValue().getSalary();
				if(i == 0)
					i = emp1.getValue().getCity().compareTo(emp2.getValue().getCity());
				return i;
			}
		});
		Iterator<Map.Entry<Employee2, EmployeeDetails2>> itr = list.iterator();
		while(itr.hasNext()){
			Map.Entry<Employee2, EmployeeDetails2> data = itr.next();
			System.out.println(data);
		}
	}
	public static void printMap(Map<Employee2,EmployeeDetails2> unMap){
		for(Map.Entry<Employee2, EmployeeDetails2> map :unMap.entrySet()){
			System.out.println(map.getKey()+"......"+map.getValue());
		}	
	}
}

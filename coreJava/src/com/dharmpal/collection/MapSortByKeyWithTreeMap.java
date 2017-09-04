package com.dharmpal.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


class Employee3 implements Comparable<Employee3>{
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
	public Employee3(Long empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public int compareTo(Employee3 emp) {
		int i = (int) (this.empId-emp.empId);
		if(i == 0)
			i=this.empName.compareTo(emp.empName);
		return i;
	}
	
	
	/*public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null || this.getClass() != obj.getClass())
			return false;
		Employee emp = (Employee)obj;
		return emp.getEmpId() == this.empId && emp.getEmpName().equals(this.getEmpName());
	}*/
}
class EmployeeDetails3{
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
	public EmployeeDetails3(Long empId, String empEmail, int salary, int age,
			String city) {
		super();
		this.empId = empId;
		this.empEmail = empEmail;
		this.salary = salary;
		this.age = age;
		this.city = city;
	}
	/*@Override
	public int compareTo(EmployeeDetails empd) {
		int i = (int) (this.empId-empd.empId);
		if(i == 0)
			i = this.empEmail.compareTo(empd.empEmail);
		if(i == 0)
			i = this.salary-empd.salary;
		if(i == 0)
			i = this.age - empd.age;
		if( i == 0)
			i = this.city.compareTo(empd.city);
		return i;
	}*/
}
public class MapSortByKeyWithTreeMap {
	public static void main(String[] args) {
		Employee3 emp1 = new Employee3(new Long(444),"Dharmpal");
		Employee3 emp2 = new Employee3(new Long(222),"kansujia");
		Employee3 emp3 = new Employee3(new Long(111),"Sunil");
		Employee3 emp4 = new Employee3(new Long(555),"Deepak");
		Employee3 emp5 = new Employee3(new Long(333),"Rahul");
		
		EmployeeDetails3 empDt1 = new EmployeeDetails3(new Long(222), "dharmpal@gmail.com", 50000, 26, "fazilka");
		EmployeeDetails3 empDt2 = new EmployeeDetails3(new Long(444), "kansujia@gmail.com", 45000, 27, "frozepur");
		EmployeeDetails3 empDt3 = new EmployeeDetails3(new Long(222), "sunil@gmail.com", 35000, 29, "abohar");
		EmployeeDetails3 empDt4 = new EmployeeDetails3(new Long(222), "deepak@gmail.com", 65000, 25, "lucknow");
		EmployeeDetails3 empDt5 = new EmployeeDetails3(new Long(222), "rahul@gmail.com", 35000, 28, "punjab");
		Map<Employee3,EmployeeDetails3> unMap = new HashMap<>();
		unMap.put(emp1, empDt1);
		unMap.put(emp2, empDt2);
		unMap.put(emp3, empDt3);
		unMap.put(emp4, empDt4);
		unMap.put(emp5, empDt5);
		System.out.println("------------------UnSortedMap------------------");
		printMap(unMap);
		System.out.println("***********************************************");
		System.out.println("--------------SortedMap By Using TreeMap-------");
		Map<Employee3,EmployeeDetails3> sortMap = new TreeMap<Employee3, EmployeeDetails3>(unMap);
		printMap(sortMap);
	}
	public static void printMap(Map<Employee3,EmployeeDetails3> unMap){
		for(Map.Entry<Employee3, EmployeeDetails3> map :unMap.entrySet()){
			System.out.println(map.getKey()+"......"+map.getValue());
		}
		
	}
}

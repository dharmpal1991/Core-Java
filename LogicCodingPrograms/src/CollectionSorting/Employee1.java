package CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee1 implements Comparable<Employee1> {
	private String id;
	private String name;
	private String salary;

	public Employee1(String id, String name, String salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getid() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSalary() {
		return salary;
	}

	public String toString() {
		return "[ id =" + id + ",name=" + name + ",Salary=" + salary + "]";
	}
	// for ascending order by name
	/*public int compareTo(Employee1 obj) {
		return this.name.compareTo(obj.name);
	}*/
	
	//for descending order by name
	public int compareTo(Employee1 obj){
		return obj.salary.compareTo(this.salary);
	}

	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<Employee1>();
		list.add(new Employee1("101", "vappu", "25000"));
		list.add(new Employee1("102", "bappu", "45000"));
		list.add(new Employee1("103", "abhi", "15000"));
		list.add(new Employee1("104", "abhi", "10000"));
		list.add(new Employee1("105", "kappu", "5000"));
		Collections.sort(list);
		System.out.println(list);
	}

}

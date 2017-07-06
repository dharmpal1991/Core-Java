package CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee3 implements Comparable<Employee3> {
	private String id;
	private String name;

	public Employee3(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	/*// Ascending order by name
	public int compareTo(Employee3 obj) {
		return this.name.compareTo(obj.name);
	}*/
	
	// Descending order by name
	public int compareTo(Employee3 obj){
		return obj.name.compareTo(this.name);
	}

	public String toString() {
		return "[id = " + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		List<Employee3> list = new ArrayList<Employee3>();
		list.add(new Employee3("101", "sanju"));
		list.add(new Employee3("110", "ranju"));
		list.add(new Employee3("133", "zanju"));
		list.add(new Employee3("145", "eanju"));
		list.add(new Employee3("167", "aanju"));
		Collections.sort(list);
		System.out.println(list);
	}

}
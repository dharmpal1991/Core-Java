package CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee4 implements Comparator<Employee4> {
	private String id;
	private String name;

	public Employee4() {

	}

	public Employee4(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "[id = " + id + ",name=" + name + "]";
	}

	// Ascending sorting by name
	/*
	 * public int compare(Employee4 obj1,Employee4 obj2){ return
	 * obj1.name.compareTo(obj2.name); }
	 */

	// Descending Sorting by name
	/*
	 * public int compare(Employee4 obj1,Employee4 obj2){ return
	 * obj2.name.compareTo(obj1.name); }
	 */

	// Ascending sorting by id
	/*
	 * public int compare(Employee4 obj1,Employee4 obj2){ return
	 * obj1.id.compareTo(obj2.id); }
	 */

	public int compare(Employee4 obj1, Employee4 obj2) {
		return obj2.id.compareTo(obj1.id);
	}
}

public class MyComprator {
	public static void main(String[] args) {
		List<Employee4> list = new ArrayList<Employee4>();
		list.add(new Employee4("101", "sanju"));
		list.add(new Employee4("110", "ranju"));
		list.add(new Employee4("133", "zanju"));
		list.add(new Employee4("145", "eanju"));
		list.add(new Employee4("167", "aanju"));
		Collections.sort(list, new Employee4());
		System.out.println(list);
	}
}

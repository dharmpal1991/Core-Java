package CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getid() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public String toString() {
		return "[ id =" + id + ",name=" + name + ",Salary=" + salary + "]";
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Employee(101, "pappu", 5000));
		list.add(new Employee(102, "pappu", 5000));
		list.add(new Employee(103, "abhi", 5000));
		list.add(new Employee(104, "abhi", 10000));
		list.add(new Employee(105, "pappu", 5000));
		Collections.sort(list, new MyComparator());
		System.out.println(list);

	}

}

class MyComparator implements Comparator<Employee> {
	public int compare(Employee obj1, Employee obj2) {
		String str = obj1.getName();
		int i = str.compareTo(obj2.getName());
		if (i == 0)
			i = obj1.getSalary() - obj2.getSalary();
		return i;
	}

}

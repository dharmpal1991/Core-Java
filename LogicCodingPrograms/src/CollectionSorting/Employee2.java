package CollectionSorting;

import java.util.Arrays;


public class Employee2 {
	private String id;
	private String name;
	private String salary;

	public Employee2(String id, String name, String salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSalary() {
		return salary;
	}

	public String toString() {
		return "[id = " + id + ",name = " + name + ",salary = " + salary + "]";
	}

	public int hashCode() {
		String str = this.id;
		Integer sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum = sum + str.charAt(i);
		}
		return sum;
	}

	/*
	 * public int hashCode(String str) { final int index = 5; int hash = 1; hash
	 * = index * hash + (id == null ? 0 : this.id.hashCode()); hash = index *
	 * hash + (name == null ? 0 : this.name.hashCode()); hash = index * hash +
	 * (salary == null ? 0 : this.salary.hashCode()); return hash; }
	 */
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj == null || obj.getClass() != getClass()) {
			return false;
		} else {
			Employee2 emp = (Employee2) obj;
			if (this.id == emp.getId() && this.name == emp.getName()
					&& this.salary == emp.getSalary()) {
				return true;
			}
		}
		return result;
	}


	public static void main(String[] args) {
		Employee2 emp1[] = new Employee2[4];
		emp1[0] = new Employee2("120", "dk", "2000");
		emp1[1] = new Employee2("123", "bk", "2000");
		emp1[2] = new Employee2("119", "dharm", "1200");
		emp1[3] = new Employee2("124", "bk", "1399");

		for (int i = 0; i < emp1.length; i++) {
			for (int j = i + 1; j < emp1.length; j++) {
				if (emp1[i].hashCode() > emp1[j].hashCode()) {
					Object o = null;
					o = emp1[i];
					emp1[i] = emp1[j];
					emp1[j] = (Employee2) o;
				}
			}
		}
		System.out.println(Arrays.toString(emp1));
	}
}

package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterationOfList {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List a = new ArrayList();
		a.add("Dharmpal");
		a.add("Kansujia");
		a.add(25);
		a.add('d');
		System.out.println("Size of List:" + a.size());

		System.out.println("Iteration by for Loop:");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		System.out.println("Iteration by For Each Loop:");
		for (Object o : a) {
			System.out.println(o);
		}

		System.out.println("Iteration by iterator:");
		Iterator itr = a.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Iterator by ListIterator:");
		ListIterator ltr = a.listIterator();
		while (ltr.hasNext()) {
			System.out.println(ltr.next());
		}

		System.out.println("Iteration by While Loop");
		int i = 0;
		while (i < a.size()) {
			System.out.println(a.get(i));
			i++;
		}
	}

}

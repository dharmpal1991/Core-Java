package Collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromArrayList {
	public static void main(String[] args) {
		List<Object> l = new ArrayList<Object>();
		l.add("java");
		l.add('c');
		l.add("jsp");
		l.add(10.3);
		l.add('c');
		l.add(14);
		l.add("java");
		l.add(12);
		l.add("jsp");
		l.add("yahoo");

		System.out.println("Before Remove Duplicate Elements:" + l);

		for (int i = 0; i < l.size(); i++) {
			for (int j = i + 1; j < l.size(); j++) {
				if (l.get(i).equals(l.get(j))) {
					l.remove(j);
					j--;
				}
			}
		}
		System.out.println("After Removing Duplicate Elements:" + l);
	}

}

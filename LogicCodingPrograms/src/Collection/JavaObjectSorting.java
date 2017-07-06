package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaObjectSorting {
	public static void main(String[] args) {
		System.out.println("Sorting Primitive Arrays.........");
		int[] i = { 5, 9, 10, 1, 20, 3, 5, 8, 90 };
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));

		System.out.println("Sorting String Arrays............");
		String[] s = { "A", "C", "B", "F", "Z", "W", "T", "H", "J" };
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));

		System.out.println("Sorting Wapper Objects...........");
		List<String> l = new ArrayList<String>();
		l.add("A");
		l.add("N");
		l.add("B");
		l.add("J");
		l.add("L");
		l.add("P");
		l.add("D");
		l.add("E");
		l.add("C");
		l.add("Z");
		Collections.sort(l);
		for (String str : l) {
			System.out.print(" " + str);
		}

	}

}

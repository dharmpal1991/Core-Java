package Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class IterationOfMap {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("dharmpal", 25);
		map.put("kansujia", 20);
		map.put("akshay", 50);
		map.put("sumit", 24);
		map.put("sandy", 34);

		System.out.println("Iteration by For Each Loop:.........");

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " ," + "Value: "
					+ entry.getValue());
		}

		System.out.println("Iteration by Iterator:.............");

		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println("Key: " + entry.getKey() + " ," + "Value:"
					+ entry.getValue());
		}
	}

}

package Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertMapToList {
	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		Map<String,Integer> map = new LinkedHashMap<>();
		map.put("dharmpal", 25);
		map.put("kansujia", 20);
		map.put("akshay", 50);
		map.put("sumit", 24);
		map.put("sandy", 34);
		
		Set<String> s = map.keySet();
		Set entry = map.entrySet();
		Collection<Integer> v = map.values();
		List<String> list = new LinkedList<>(s);
		Iterator<String> it = list.iterator();
		System.out.println("1st Way ......");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("********************************************");
		System.out.println("2nd Way.....");
		
		@SuppressWarnings("unchecked")
		List<Entry<String,Integer>> list1 = new LinkedList<>(entry);
		Iterator<Entry<String,Integer>> itr = list1.iterator();
		while (itr.hasNext()){
			Entry<String, Integer> i = itr.next();
			System.out.println(i);
		}
	}

}

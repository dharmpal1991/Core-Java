package com.Demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(1, "abc");
		map.put(2, "xyz");
		map.put(5, "nhd");
		map.put(9, "hfj");
		map.put(7, "eri");
		System.out.println(map);
		
		for(Entry<Integer, String> entry:map.entrySet()){
			System.out.println("Key is:"+ entry.getKey()+"\t" + "Value is:"+entry.getValue());
		}
	}

}

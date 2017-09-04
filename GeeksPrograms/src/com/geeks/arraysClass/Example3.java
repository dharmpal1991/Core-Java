package com.geeks.arraysClass;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example3 {
	public static void main(String[] args) {
		Integer [] arr = {4,8,16,20,24,8,34,32,28};
		
		List<Integer> l = Arrays.asList(arr);
		System.out.println(l);
		@SuppressWarnings("rawtypes")
		Iterator it = l.iterator();
			while(it.hasNext()){
				Integer i = (Integer) it.next();
				if(i%2 == 0)
					System.out.println(i+" ");
				else
					it.remove();
			}
			System.out.print(l);
	}

}

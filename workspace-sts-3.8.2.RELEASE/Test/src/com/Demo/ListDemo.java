package com.Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List <Integer>l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(40);
		System.out.println(l);
		Iterator it = l.iterator();
			while(it.hasNext()){
			Object o	=it.next();
				System.out.println(o);
			}
		
	}

}

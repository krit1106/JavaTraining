package com.collections;

import java.util.*;
import java.util.Iterator;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> s = new LinkedHashSet<String>();
		s.add("Kritika");
		s.add("Aditi");
		s.add("Surbhi");

		Iterator itr = s.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		s.add("Kritika");
		s.add("Abhas");
		s.add("Aditi");
		s.add("Sanket");
		s.add("Surbhi");
		
		System.out.println(s);
		
		System.out.println(s.size());
		
	}

}

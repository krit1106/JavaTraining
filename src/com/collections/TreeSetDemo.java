package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> s = new TreeSet<String>();
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

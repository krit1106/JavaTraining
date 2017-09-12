package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> set1=new HashSet<String>();
		set1.add("Kritika");
		set1.add("Aditi");
		set1.add("Surbhi");

		Iterator itr = set1.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		set1.add("Kritika");
		System.out.println(set1);
		
		System.out.println(set1.size());
	}

}

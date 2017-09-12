package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("C++");
		list1.add("Core Java");
		list1.add("Advanced Java");
		list1.add("Advanced Java");
		
		System.out.println("The fresh collection is: " + list1);
		
		Collections.addAll(list1, "Data Structure", "DBMS", "Operating Systems");
		
		Collections.replaceAll(list1, "Advanced Java", "J2EE");
		
		System.out.println("The new collection is: " + list1);
		
		Collections.sort(list1);
		System.out.println("The sorted collection is: " + list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(7);
		list2.add(19);
		list2.add(55);
		list2.add(92);
		list2.add(40);
		
		System.out.println("The max value is: " + Collections.max(list2));
		System.out.println("The min value is: " + Collections.min(list2));
		
		Collections.sort(list2);
		System.out.println("The sorted collection is: " + list2);
	}

}

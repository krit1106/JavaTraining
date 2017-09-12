package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Newyork");
		list.add("London");
		list.add("New Jersey");
		list.add("Florida");
		
		System.out.println("The size of the list is: " + list.size());
		System.out.println(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println("Element is: " + itr.next()); 
		}
		
		for(String obj : list){
			System.out.println("For each loop is printing: " + obj);
		}
		
		list.remove(1);
		System.out.println(list);
		
		System.out.println("The new size of the list is: " +list.size());
		
		list.removeAll(list);
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("India");
		list2.add("US");
		list2.add("UK");
		
		list.addAll(list2);
		System.out.println(list);
	}

}

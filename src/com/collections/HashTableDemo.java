package com.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer,String> h = new Hashtable<Integer,String>();
		
		h.put(1, "Dog");
		h.put(2, "Cat");
		h.put(3, "Lion");
		h.put(4, "Zebra");
		h.put(5, "Elephant");
		
		for(Map.Entry e:h.entrySet()){
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		h.remove(3);
		System.out.println("The hashtable after removing: " + h);
	}

}

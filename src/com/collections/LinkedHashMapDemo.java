package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> h = new LinkedHashMap<Integer, String>();
		h.put(1, "Ankana");
		h.put(2, "Rohit");
		h.put(3, "Rohit");
		h.put(4, "Himanshu");
		h.put(5, "Sakshi");
		h.put(5, "Akash");
		
		for(Map.Entry k:h.entrySet()){
			System.out.println(k.getKey() + " " + k.getValue());
		}

	}

}

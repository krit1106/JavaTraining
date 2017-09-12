package com.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> h = new TreeMap<Integer, String>();
		h.put(1, "Ankana");
		h.put(4, "Himanshu");
		h.put(2, "Rohit");
		h.put(6, "Akash");
		h.put(3, "Rohit");
		h.put(5, "Sakshi");
		
		
		for(Map.Entry k:h.entrySet()){
			System.out.println(k.getKey() + " " + k.getValue());
		}
	}

}

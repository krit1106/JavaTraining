package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> h = new HashMap<Integer,String>();
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

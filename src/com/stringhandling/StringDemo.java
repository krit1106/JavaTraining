package com.stringhandling;

public class StringDemo {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java Training");
		sb.append("..........");
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		System.out.println(sb.reverse());
		
		sb.insert(3, "Morning");
		System.out.println(sb);
		
		sb.replace(3, 8, "NOON");
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		sb.ensureCapacity(100);
		System.out.println(sb.capacity());
		sb.ensureCapacity(200);
		System.out.println(sb.capacity());
		sb.ensureCapacity(450);
		System.out.println(sb.capacity());
	}

}

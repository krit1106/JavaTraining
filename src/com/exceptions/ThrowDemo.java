package com.exceptions;

public class ThrowDemo {
	
	static void vote(int age){
		if(age>18){
			System.out.println("The person can vote");
		}else{
			throw new ArithmeticException("not valid to vote");
		}
	}
	public static void main(String[] args) {
		vote(15);
		
		System.out.println("rest of the code......");

	}

}

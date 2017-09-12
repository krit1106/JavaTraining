package com.exceptions;

public class FinallyDemo {

	public static void main(String[] args) {
		try{
			int i = 25/0;
			System.out.println(i);
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		finally{
			System.out.println("This code will always get executed");
			
			System.out.println("no matter what!!!");
		}
	}

}

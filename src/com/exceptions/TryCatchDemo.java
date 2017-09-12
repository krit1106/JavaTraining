package com.exceptions;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		try{
			try{
				System.out.println("I am going to perform a division");
				int data = 10/0;
			}catch(ArithmeticException e){
				System.out.println(e);
			}
			
			try{
				int a[] = new int[5];
				a[5] = 11;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("rest of the code");
	}

}

package com.exceptions;

import java.io.IOException;

class Parent{
	void display() throws Exception{
		System.out.println("Good Afternoon");
	}
}

public class MethodOverridingDemo extends Parent{

	void display() throws ArithmeticException{
		System.out.println("Good Evening");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
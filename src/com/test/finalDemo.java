package com.test;

final class Person{
	
}

class Vote{
	//static blank final variable
	static final int data; 
	static{
		data = 10;
	}
	
	//final blank variable
	final int a;
	Vote(){
		a = 30;
	}
	
	final void vote(){
		System.out.println("I can vote now.");
	}
}

public class finalDemo extends Vote{
	
	final int age = 20; //final variable
	 void show(){
		 vote();
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalDemo f = new finalDemo();
		f.vote();
		f.show();
	}

}

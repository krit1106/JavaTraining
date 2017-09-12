package com.test;

class Abc{
	private int data = 10;
	private void msg(){
		System.out.println("I am a private method.");
	}
	
	void display(){
		System.out.println(data);
	}
}

public class AccModDemo {
	
	protected void msg(){
		System.out.println("I am inside a protected method.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj = new Abc();
		obj.display();
	}

}

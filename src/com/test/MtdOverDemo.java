package com.test;

class Vehicle{
	
	String color="White";
	
	void run(){
		System.out.println("A vehicle is running");
	}
}

public class MtdOverDemo extends Vehicle{
	String color="Red";
	
	void run(){
		System.out.println("A vehicle runs fast");
		super.run();
	}
	
	void display(){
		System.out.println("The first vehicle is" + color);
		System.out.println("The second vehicle is" + super.color);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MtdOverDemo m = new MtdOverDemo();
		m.run();
		m.display();
	}

}

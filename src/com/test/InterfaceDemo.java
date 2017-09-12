package com.test;

interface print{
	int age = 10;
	void display();
}

interface showable{
	void show();
}

abstract class A implements print{
	public void display(){
		System.out.println("Helloooo");
	}
}

class Paper implements print, showable{
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Printing on a paper..");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Showing the paper to a friend");
	}
	
}

class Canvas implements print{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Printing on a canvas..");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paper p = new Paper();
		p.display();
		p.show();
		print p1 = new Canvas();
		p1.display();
	}

}

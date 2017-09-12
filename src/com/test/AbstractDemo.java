package com.test;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("A rectangle is drawn..");
	}
	
}

class Circle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("A circle is drawn..");
	}
	
}

public class AbstractDemo{
	protected void newMethod(){
		System.out.println("I am inside a public method.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Rectangle();
		s.draw();
		Shape s2 = new Circle();
		s2.draw();
	}

}

package com.test;

public class PolyDemo {
	int stud_id;
	String stud_name;
	
	//default constr
	PolyDemo(){
		System.out.println("The default constructor is getting invoked..!!");
	}
	
	//parameterized contrct
	PolyDemo(int id, String name){
		stud_id = id;
		stud_name = name;
	}
	
	void display(){
		System.out.println("Student name is:" + stud_name + " and Student id is:" + stud_id);
	}
	
	int add(int a, int b){
		int sum = a+b;
		return sum;
	}
	
	int add(int c, int d, int e){
		int sum = c+d+e;
		return sum;
	}
	
	String add(String a, String b){
		
		return a;
	}
	
	public static void main(String[] args) {	//JVM will always start the execution of the program from here.
		// TODO Auto-generated method stub
		PolyDemo obj1= new PolyDemo();
//		obj1 = null;
		int result = obj1.add(2,3,4);
		System.out.println(result);
		PolyDemo obj2= new PolyDemo();
		obj1=obj2;
		int result2 = obj1.add(14, 11, 17);
		System.out.println(result2);
		
		PolyDemo obj3 = new PolyDemo(17, "Kritika");
		obj3.display();
		
		main("Hello");
	}
	
	public static void main(String arg1){
		System.out.println(arg1);
	}

}

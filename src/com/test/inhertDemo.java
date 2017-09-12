package com.test;

class Employee{ //parent class
	float salary = 40000;
	
	void work(){
		System.out.println("working hard!!");
	}
}

class Worker{
	
	void earns(){
		System.out.println("earns a good salary.");
	}
}

public class inhertDemo extends Employee{ 
	int bonus=10000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inhertDemo d = new inhertDemo();
		
		Worker w = new Worker();
		System.out.println("salary is:" + d.salary + " and bonus is: " + d.bonus );
		d.work();
		w.earns();
		
	}

}

package com.test;

public class ThisDemo {
	String name="consultadd";
	int id=505;
	
	void display(String name, int id){
		System.out.println(name + id);
		System.out.println(this.name + this.id);
		
		this.name = name;
		this.id = id;
		
		printGlobal(this.name, this.id);
	}
	
	void printGlobal(String s, int i){
		System.out.println(s + i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo t = new ThisDemo();
		t.display("abcxyz", 202);
	}

}

package com.test;

public class FinalizeDemo {
	public void finalize(){
		System.out.println("object is getting removed...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeDemo f = new FinalizeDemo();
		f = null;
	}

}

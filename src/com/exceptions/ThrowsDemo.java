package com.exceptions;

import java.io.IOException;

class Test{
	void testing1() throws IOException {
		throw new IOException("an error occured..");
	}
	
	void testing2() throws IOException{
		testing1();
	}
	
	void testing3(){
		try{
			testing2();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

public class ThrowsDemo {

	public static void main(String[] args){
		Test t = new Test();
		t.testing3();
	}

}

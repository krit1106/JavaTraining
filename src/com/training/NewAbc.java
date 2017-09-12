package com.training;
import com.test.*;

class Test extends AccModDemo{
	void show(){
		msg();
	}
}

public class NewAbc extends AbstractDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.show();
		NewAbc n = new NewAbc();
		n.newMethod();
	}

}

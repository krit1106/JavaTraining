package com.test;

public class Demo {
	public static void main(String[] args){
		int age = 20, k=1, j=2;
		
		switch(age){
		case 10: System.out.println("10"); break;
		case 20: System.out.println("20"); break;
		case 30: System.out.println("30"); break;
		default: System.out.println("....");
		}
		
		for(int i=0; i<20; i++){
			System.out.println("I am in java training");
		}
		
		while(k<=10){
			System.out.println("I am learning java....");
			k++;
		}
		
		do{
			System.out.println("Happy Mornings!!");
			j++;
		}while(j<=10);
		
		for(int a=0; a<=10; a++){
			System.out.println("1 2 3... GO!!");
			
			if(a == 5){
				continue;
			}
			System.out.println(a);
		}
	}
}

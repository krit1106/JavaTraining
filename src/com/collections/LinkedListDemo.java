package com.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Book{
	int book_id;
	String book_name, author;
	int quantity;
	
	public Book(int book_id, String book_name, String author, int quantity){
		this.book_id = book_id;
		this.book_name = book_name;
		this.author = author;
		this.quantity = quantity;
	}
}

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Book> booklist = new LinkedList<Book>();
		
		//creating books
		
		Book b1 = new Book(1, "Complete reference java", "abc", 15);
		Book b2 = new Book(2, "Let us C", "Yashwant", 10);
		
		//add the books to the list
		booklist.add(b1);
		booklist.add(b2);
		
		for(Book b : booklist){
			System.out.println(b.book_id + "--" + b.book_name + "--" + b.author + "--" + b.quantity);
		}
	}

}

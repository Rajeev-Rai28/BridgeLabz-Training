package com.constructors.levelone;

public class Book {
	
	//Attributes
	String title;
	String author;
	double price;
	
	//default constructors
	Book(){
		title = "Java";
		author = "James Gosling";
		price = 199.0;
	}
	//Parameterized Constructor
	Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// Display book details
	void displayBookDeatils() {
		System.out.println("Book Title : "+title);
		System.out.println("Book Author : "+author);
		System.out.println("Book price : "+price);
			
	}


}

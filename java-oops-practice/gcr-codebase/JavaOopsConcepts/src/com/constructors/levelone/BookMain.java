package com.constructors.levelone;
public class BookMain {

	public static void main(String[] args) {
		
		//create a Book class object for deafult constructor
		Book book1 = new Book();
		book1.displayBookDeatils();
		
		System.out.println();
		
		Book book2 = new Book("python", "Guido van Rossum", 150.0);
		book2.displayBookDeatils();
		
		
		


	}

}

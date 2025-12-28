package com.constructors.levelone;

public class LibraryBook {
	    // Attributes
	    String title;
	    String author;
	    double price;
	    boolean availability;

	    // Constructor
	    LibraryBook(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.availability = true; // book is available initially
	    }

	    // Method to borrow a book
	    void borrowBook() {
	        if (availability) {
	            availability = false;
	            System.out.println("You have successfully borrowed: " + title);
	        } else {
	            System.out.println("Sorry, the book is already borrowed.");
	        }
	    }

	    // Method to display book details
	    void displayDetails() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: ₹" + price);
	        System.out.println("Available: " + availability);
	    }
	}

package com.constructors.levelone;

public class BookSystem {
	// Public variable
    public String ISBN;

    // Protected variable
    protected String title;

    // Private variable
    private String author;

    // Constructor
    BookSystem(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter for private author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for private author
    public String getAuthor() {
        return author;
    }

    // Display book details
    public void displayBookDetails() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("----------------------");
    }
}

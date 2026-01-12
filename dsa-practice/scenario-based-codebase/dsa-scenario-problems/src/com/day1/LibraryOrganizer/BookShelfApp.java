package com.day1.LibraryOrganizer;

public class BookShelfApp {
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        shelf.addBook("Java", new Book(1, "Head First Java", "Kathy"));
        shelf.addBook("Java", new Book(2, "Effective Java", "Bloch"));
        shelf.addBook("Fiction", new Book(3, "Harry Potter", "Rowling"));

        shelf.display();

        shelf.removeBook("Java", 1);

        shelf.display();
    }
}


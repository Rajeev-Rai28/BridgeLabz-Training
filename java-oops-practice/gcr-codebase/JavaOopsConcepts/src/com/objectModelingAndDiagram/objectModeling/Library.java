package com.objectModelingAndDiagram.objectModeling;

import java.util.ArrayList;

public class Library {
    String libraryName;
    ArrayList<Book> books;

    // Constructor
    Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    // Add book to library
    void addBook(Book book) {
        books.add(book);
    }

    void displayLibraryBooks() {
        System.out.println("Books in " + libraryName + ":");
        for (Book b : books) {
            b.displayBook();
        }
        System.out.println();
    }
}


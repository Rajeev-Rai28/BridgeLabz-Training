package com.day1LibraryOrganizer;

import java.util.*;

class BookShelf {

    HashMap<String, LinkedList<Book>> catalog = new HashMap<>();
    HashSet<Book> uniqueBooks = new HashSet<>(); // optional

    // Add book
    public void addBook(String genre, Book book) {

        // Prevent duplicates
        if (uniqueBooks.contains(book)) {
            System.out.println("Book already exists!");
            return;
        }

        // If genre not present, create it
        catalog.putIfAbsent(genre, new LinkedList<>());

        // Add book
        catalog.get(genre).add(book);
        uniqueBooks.add(book);

        System.out.println("Book added to " + genre);
    }

    // Remove book (borrow)
    public void removeBook(String genre, int bookId) {

        if (!catalog.containsKey(genre)) {
            System.out.println("Genre not found!");
            return;
        }

        LinkedList<Book> list = catalog.get(genre);

        Iterator<Book> it = list.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.id == bookId) {
                it.remove();
                uniqueBooks.remove(b);
                System.out.println("Book borrowed/removed!");
                return;
            }
        }

        System.out.println("Book not found!");
    }

    // Display catalog
    public void display() {
        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println("   " + b);
            }
        }
    }
}

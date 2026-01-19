package com.day6.SmartLibrary;

public class SmartLibraryApp {

    public static void main(String[] args) {

        Book[] borrowedBooks = {
            new Book("Data Structures"),
            new Book("Algorithms"),
            new Book("Java Programming"),
            new Book("Computer Networks"),
            new Book("Operating Systems")
        };

        System.out.println("Before Sorting (Borrow Order):");
        for (Book b : borrowedBooks) {
            System.out.println(b);
        }

        LibrarySorter.insertionSort(borrowedBooks);

        System.out.println("\nAfter Sorting (Alphabetical by Title):");
        for (Book b : borrowedBooks) {
            System.out.println(b);
        }
    }
}


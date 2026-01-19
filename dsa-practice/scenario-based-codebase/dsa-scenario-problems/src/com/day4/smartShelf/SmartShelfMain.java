package com.day4.smartShelf;

public class SmartShelfMain {
    public static void main(String[] args) {

        Book[] books = {
            new Book("Java"),
            new Book("C"),
            new Book("Python"),
            new Book("Android")
        };

        SmartShelf.insertionSort(books);

        for (Book b : books) {
            System.out.println(b);
        }
    }
}


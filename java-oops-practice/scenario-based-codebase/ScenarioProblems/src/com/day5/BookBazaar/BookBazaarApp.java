package com.day5.BookBazaar;

public class BookBazaarApp {
    public static void main(String[] args) {

        Book ebook = new EBook("Java Mastery", "James Gosling", 500, 20);
        Book printed = new PrintedBook("DSA in Java", "Robert Lafore", 800, 10);

        Order order1 = new Order("Rajeev", ebook, 2);
        order1.placeOrder();
        order1.showOrderDetails();

        System.out.println("--------------------------");

        Order order2 = new Order("Amit", printed, 1);
        order2.placeOrder();
        order2.showOrderDetails();
    }
}

package com.day5.BookBazaar;

public class Book {
    private String title;
    private String author;
    private double price;
    private int stock;   // 🔒 encapsulated

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Optional offer constructor
    public Book(String title, String author, double price) {
        this(title, author, price, 10); // default stock = 10
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // ✅ Encapsulation: stock update only through method
    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            System.out.println("❌ Not enough stock for " + title);
        }
    }
}


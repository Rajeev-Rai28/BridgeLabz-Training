package com.day5.BookBazaar;

public class PrintedBook extends Book implements IDiscountable {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double totalPrice) {
        // 10% discount on PrintedBook
        return totalPrice * 0.90;
    }
}


package com.day5.BookBazaar;

public class EBook extends Book implements IDiscountable {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double totalPrice) {
        // 20% discount on EBook
        return totalPrice * 0.80;
    }
}

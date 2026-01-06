package com.day3.SwiftCart;

public class SwiftCartDemo {
    public static void main(String[] args) {

        Product milk = new PerishableProduct("Milk", 60);
        Product rice = new NonPerishableProduct("Rice", 100);

        Cart cart = new Cart();
        cart.addProduct(milk);
        cart.addProduct(rice);

        cart.generateBill();
    }
}

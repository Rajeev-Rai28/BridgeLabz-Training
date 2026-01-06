package com.day3.SwiftCart;

class PerishableProduct extends Product {

    PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    @Override
    double getDiscountedPrice() {
        return price * 0.90; 
    }
}

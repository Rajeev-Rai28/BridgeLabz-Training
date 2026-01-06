package com.day3.SwiftCart;

import java.util.ArrayList;
import java.util.List;

class Cart implements ICheckout {

    private List<Product> products;
    private double totalPrice;

    // Constructor without items
    Cart() {
        products = new ArrayList<>();
    }

    // Constructor with pre-selected items
    Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }

    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getDiscountedPrice();     
        }
    }

    @Override
    public double applyDiscount() {
        double coupon = 50;
        return totalPrice - coupon; // operators
    }

    @Override
    public void generateBill() {
        System.out.println("Items in Cart:");
        for (Product p : products) {
            System.out.println(p.name + " - ₹" + p.getDiscountedPrice());
        }
        System.out.println("Final Amount: ₹" + applyDiscount());
    }
}

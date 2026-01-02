package com.encapsulationAndPolymorphism;

abstract class FoodItem implements Discountable {

    protected String itemName;
    protected double price;
    protected int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method
    abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName +
                ", Price: " + price +
                ", Quantity: " + quantity);
    }
}

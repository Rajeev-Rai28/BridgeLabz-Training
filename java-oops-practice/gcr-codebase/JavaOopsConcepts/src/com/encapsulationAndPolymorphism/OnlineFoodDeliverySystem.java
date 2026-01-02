package com.encapsulationAndPolymorphism;

public class OnlineFoodDeliverySystem {

    // Order processing using polymorphism
    static void processOrder(FoodItem item) {
        item.getItemDetails();
        System.out.println("Total Price: ₹" + item.calculateTotalPrice());
        System.out.println(item.getDiscountDetails());
        System.out.println("Discount: ₹" + item.applyDiscount());
        System.out.println("Final Price: ₹" +
                (item.calculateTotalPrice() - item.applyDiscount()));
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        FoodItem item1 = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 250, 1);

        processOrder(item1);
        processOrder(item2);
    }
}

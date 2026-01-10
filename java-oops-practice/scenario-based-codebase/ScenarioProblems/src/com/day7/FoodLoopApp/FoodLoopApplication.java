package com.day7.FoodLoopApp;

public class FoodLoopApplication {
    public static void main(String[] args) {

        // Create food items
        FoodItem pizza = new VegItem("Paneer Pizza", 250, 5);
        FoodItem burger = new VegItem("Veg Burger", 120, 5);
        FoodItem chicken = new NonVegItem("Chicken Biryani", 350, 3);

        // Create order
        Order order = new Order();

        // Add items
        order.addItem(pizza);
        order.addItem(burger);
        order.addItem(chicken);

        // Place order
        order.placeOrder();

        // Uncomment to test cancel
        // order.cancelOrder();
    }
}


package com.day6.FoodLoopApp;

public class FoodItem {
	
	private String name;
	private String category;
	private double price;
	private boolean available;
	private int stock;
	
	
	FoodItem(String name, String category, double price, boolean available, int stock){
		this.name = name;
		this.category = category;
		this.price = price;
		this.available = available;
		this.stock = stock;
	}
	
	 // Getter methods (no direct stock access)
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    // Reduce stock safely
    public boolean reduceStock() {
        if (stock > 0) {
            stock--;
            return true;
        } else {
            available = false;
            return false;
        }
    }
}

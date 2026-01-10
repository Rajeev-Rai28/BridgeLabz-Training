package com.day7.FoodLoopApp;
import java.util.ArrayList;

public class Order implements IOrderable {
	
	private ArrayList<FoodItem> items;
	private double totalAmount;
	
	//Empty order
	public Order() {
		items = new ArrayList<>();
		totalAmount = 0;
	}
	
	//Combo ordeer
	public Order(ArrayList<FoodItem> items) {
		this.items = items;
		totalAmount = 0;
	}
	
	//Add item to order
	public void addItem(FoodItem item) {
		if(item.isAvailable() && item.reduceStock()) {
			items.add(item);
			System.out.println(item.getName() + " Added to order.");
		}else {
			System.out.println(item.getName() + " Is out odf stock.");
		}
	}
	
	//Calculate total
	private void calculateTotal() {
		totalAmount = 0;
		for(FoodItem item : items) {
			totalAmount = totalAmount + item.getPrice();
		}
	}
	
	//Apply discount(polyMorphism logic)
	private void applyDiscount() {
		if(totalAmount > 100) {
			System.out.println("20% discount applied!");
			totalAmount = totalAmount - (totalAmount * 0.20);
		}
		else if (totalAmount > 500) {
			System.out.println("10% discount applied!");
			totalAmount = totalAmount - (totalAmount * 0.10);
		}
		else {
			System.out.println("No discount applied.");
			
		}
	}
	
	@Override
	public void placeOrder() {
		if (items.isEmpty()) {
			System.out.println("No items in order.");
			return;
		}
		calculateTotal();
		applyDiscount();
		
		 System.out.println("Order placed successfully!");
	     System.out.println("Final Bill = ₹" + totalAmount);
	}
	
	@Override
    public void cancelOrder() {
        items.clear();
        totalAmount = 0;
        System.out.println("Order cancelled!");
    }
	
	

}

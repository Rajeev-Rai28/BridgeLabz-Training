package com.day3.smartCheckoutSystem;

public class SmartCheckoutApp {
	 public static void main(String[] args) {

	        SmartCheckout checkout = new SmartCheckout();

	        // Add items to store
	        checkout.addItemToStore("Milk", 50, 10);
	        checkout.addItemToStore("Bread", 30, 20);
	        checkout.addItemToStore("Sugar", 45, 5);

	        // Create customers
	        Customer c1 = new Customer("Raj");
	        c1.addItem("Milk", 2);
	        c1.addItem("Bread", 1);

	        Customer c2 = new Customer("Amit");
	        c2.addItem("Sugar", 3);
	        c2.addItem("Milk", 1);

	        // Add customers to queue
	        checkout.addCustomer(c1);
	        checkout.addCustomer(c2);

	        // Process queue
	        checkout.processCustomer();
	        checkout.processCustomer();
	        checkout.processCustomer(); // no customer
	    }
}

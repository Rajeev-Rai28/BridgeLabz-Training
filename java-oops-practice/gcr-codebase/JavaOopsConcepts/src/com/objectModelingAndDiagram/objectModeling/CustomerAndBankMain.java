package com.objectModelingAndDiagram.objectModeling;

public class CustomerAndBankMain {
	 public static void main(String[] args) {

	        // Bank object
	        Bank bank = new Bank("State Bank of India");

	        // Customers
	        Customer c1 = new Customer("Rohan");
	        Customer c2 = new Customer("Anita");

	        // Association through method calls
	        bank.openAccount(c1, 5000);
	        bank.openAccount(c2, 10000);

	        // Customers interacting with bank data
	        c1.viewBalance();
	        c2.viewBalance();
	    }
}

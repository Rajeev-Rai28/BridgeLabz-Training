package com.linkedList.SinglyLinkedList.InventoryManagementSystem;

public class InventoryManagementSystem {

    public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtEnd(101, "Laptop", 5, 60000);
        inventory.addAtBeginning(102, "Mouse", 20, 500);
        inventory.addAtEnd(103, "Keyboard", 10, 1500);
        inventory.addAtPosition(2, 104, "Monitor", 7, 12000);

        System.out.println("Inventory:");
        inventory.display();

        System.out.println("\nSearch by ID:");
        inventory.searchById(103);

        System.out.println("\nUpdate Quantity:");
        inventory.updateQuantity(102, 30);

        System.out.println("\nTotal Inventory Value:");
        System.out.println("₹" + inventory.calculateTotalValue());

        System.out.println("\nSort by Price (Ascending):");
        inventory.sortByPrice(true);
        inventory.display();

        System.out.println("\nSort by Name (Descending):");
        inventory.sortByName(false);
        inventory.display();
    }
}

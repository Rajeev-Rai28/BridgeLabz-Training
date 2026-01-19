package com.Generics.SmartWarehouseManagementSystem;

public class WarehouseItemApp {
    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("Laptop", 65000));
        electronicsStorage.addItem(new Electronics("Mobile", 30000));

        groceriesStorage.addItem(new Groceries("Rice", 1200));
        groceriesStorage.addItem(new Groceries("Oil", 800));

        furnitureStorage.addItem(new Furniture("Chair", 2500));
        furnitureStorage.addItem(new Furniture("Table", 7000));

        System.out.println("📦 Electronics Items:");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("\n🥦 Grocery Items:");
        Storage.displayItems(groceriesStorage.getItems());

        System.out.println("\n🪑 Furniture Items:");
        Storage.displayItems(furnitureStorage.getItems());
    }
}
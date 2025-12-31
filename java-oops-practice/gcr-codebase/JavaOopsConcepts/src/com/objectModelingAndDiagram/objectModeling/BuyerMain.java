package com.objectModelingAndDiagram.objectModeling;

public class BuyerMain {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Mouse", 800);
        Product p3 = new Product("Keyboard", 1500);

        Buyer buyer = new Buyer("Rahul");

        Order order1 = new Order(101);

        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p3);

        buyer.placeOrder(order1);
        buyer.viewOrders();
    }
}

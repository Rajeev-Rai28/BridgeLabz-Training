package com.inheritance.multilevelInheritance;

//Base class
public class Order {
 int orderId;
 String orderDate;

 Order(int orderId, String orderDate) {
     this.orderId = orderId;
     this.orderDate = orderDate;
 }

 String getOrderStatus() {
     return "Order Placed";
 }
}


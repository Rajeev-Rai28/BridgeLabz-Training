package com.day5.BookBazaar;

public class Order {
    private String userName;
    private Book book;
    private int quantity;
    private String orderStatus;  // 🔒 restricted update

    public Order(String userName, Book book, int quantity) {
        this.userName = userName;
        this.book = book;
        this.quantity = quantity;
        this.orderStatus = "CREATED";
    }

    // 🔒 Only internal system can update status
    private void setOrderStatus(String status) {
        this.orderStatus = status;
    }

    public void placeOrder() {
        if (book.getStock() >= quantity) {
            book.reduceStock(quantity);
            setOrderStatus("CONFIRMED");
            System.out.println("✅ Order placed successfully!");
        } else {
            System.out.println("❌ Order failed: Stock not available.");
        }
    }

    public double calculateTotal() {
        double total = book.getPrice() * quantity;   // price × quantity

        if (book instanceof IDiscountable) {
            total = ((IDiscountable) book).applyDiscount(total); // polymorphism
        }

        return total;
    }

    public void showOrderDetails() {
        System.out.println("Customer: " + userName);
        System.out.println("Book: " + book.getTitle());
        System.out.println("Quantity: " + quantity);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Total Price: ₹" + calculateTotal());
    }
}


package com.day4.eventManager;

class Ticket {
    int price;

    Ticket(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "₹" + price;
    }
}


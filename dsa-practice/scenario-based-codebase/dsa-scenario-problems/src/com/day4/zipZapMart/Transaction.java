package com.day4.zipZapMart;

class Transaction {
    int amount;

    Transaction(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "₹" + amount;
    }
}

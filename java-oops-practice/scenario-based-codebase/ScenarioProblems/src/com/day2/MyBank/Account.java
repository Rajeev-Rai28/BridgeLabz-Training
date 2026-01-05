package com.day2.MyBank;

abstract class Account {
    protected String accountNumber;  
    private double balance;           

    // constructor without opening balance
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // constructor with opening balance
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    protected void depositAmount(double amount) {
        balance += amount;
    }

    protected boolean withdrawAmount(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    protected double getBalance() {
        return balance;
    }
    public abstract double calculateInterest();
}

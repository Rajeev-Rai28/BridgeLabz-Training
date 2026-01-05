package com.day1.EWalletApplication;

abstract class Wallet implements Transferrable {

    private double balance;

    // Normal wallet
    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    // Wallet with referral bonus
    public Wallet(double initialBalance, double referralBonus) {
        this.balance = initialBalance + referralBonus;
    }

    protected void debit(double amount) {
        balance -= amount;
    }

    protected void credit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
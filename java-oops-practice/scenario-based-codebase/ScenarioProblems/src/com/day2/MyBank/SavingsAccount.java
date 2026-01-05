package com.day2.MyBank;

class SavingsAccount extends Account implements ITransaction {

    private static final double INTEREST_RATE = 4.0;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        depositAmount(amount);
        System.out.println("Amount Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (withdrawAmount(amount)) {
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: " + getBalance());
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100; // operator usage
    }
}

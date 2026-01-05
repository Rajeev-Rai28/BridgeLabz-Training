package com.day2.MyBank;

public class MyBankApp {
    public static void main(String[] args) {

        ITransaction savings = new SavingsAccount("SB101", 10000);
        ITransaction current = new CurrentAccount("CA202");

        savings.deposit(2000);
        savings.withdraw(1500);
        savings.checkBalance();

        System.out.println("Savings Interest: " + ((SavingsAccount) savings).calculateInterest());

        System.out.println("");

        current.deposit(5000);
        current.withdraw(1000);
        current.checkBalance();

        System.out.println("Current Account Interest: " +((CurrentAccount) current).calculateInterest());
    }
}
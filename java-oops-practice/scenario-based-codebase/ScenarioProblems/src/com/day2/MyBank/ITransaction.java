package com.day2.MyBank;

interface ITransaction {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}

package com.inheritance.hierarchicalInheritance;

//Superclass
public class BankAccount {
 String accountNumber;
 double balance;

 BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 void displayBasicInfo() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: ₹" + balance);
 }
}


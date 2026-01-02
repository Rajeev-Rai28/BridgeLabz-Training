package com.encapsulationAndPolymorphism;

import java.util.*;

public class BankAccountMain {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SB101", "Raj", 75000));
        accounts.add(new CurrentAccount("CA201", "Amit", 150000));

        for (BankAccount acc : accounts) {

            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Balance: ₹" + acc.getBalance());
            System.out.println("Interest: ₹" + acc.calculateInterest());

            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                System.out.println("Loan Eligible: " + loanAcc.calculateLoanEligibility());
            }

            System.out.println("----------------------------------");
        }
    }
}


package com.inheritance.hierarchicalInheritance;

public class BankAccountMain {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("SA101", 50000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA201", 30000, 20000);
        FixedDepositAccount fd = new FixedDepositAccount("FD301", 100000, 5);

        sa.displayAccountType();
        System.out.println();

        ca.displayAccountType();
        System.out.println();

        fd.displayAccountType();
    }
}


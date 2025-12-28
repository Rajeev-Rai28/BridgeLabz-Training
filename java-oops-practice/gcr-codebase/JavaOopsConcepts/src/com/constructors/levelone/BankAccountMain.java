package com.constructors.levelone;

public class BankAccountMain {
	public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(
                1234567890L,
                "Rajeev Rai",
                5000,
                4.5
        );

        sa.displaySavingsAccountDetails();

        sa.deposit(2000);
        sa.withdraw(1500);

        System.out.println("Updated Balance: ₹" + sa.getBalance());
    }
}

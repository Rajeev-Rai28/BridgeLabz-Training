package com.day1.EWalletApplication;

class BusinessWallet extends Wallet {

    private static final double TAX_RATE = 0.02; 

    public BusinessWallet(double balance) {
        super(balance);
    }

    public BusinessWallet(double balance, double referralBonus) {
        super(balance, referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        double tax = amount * TAX_RATE;
        double totalDeduction = amount + tax;

        if (getBalance() < totalDeduction) {
            System.out.println("Insufficient balance after tax");
            return;
        }

        debit(totalDeduction);
        receiver.getWallet().credit(amount);

        System.out.println("Transferred ₹" + amount + " to " + receiver.getName()
                + " (Tax deducted ₹" + tax + ")");
    }
}

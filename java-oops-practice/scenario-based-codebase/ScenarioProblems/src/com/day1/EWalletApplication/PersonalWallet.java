package com.day1.EWalletApplication;

class PersonalWallet extends Wallet {

    private static final double TRANSFER_LIMIT = 10000;

    public PersonalWallet(double balance) {
        super(balance);
    }

    public PersonalWallet(double balance, double referralBonus) {
        super(balance, referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {

        if (amount > TRANSFER_LIMIT) {
            System.out.println("Transfer limit exceeded (Personal Wallet)");
            return;
        }

        if (getBalance() < amount) {
            System.out.println("Insufficient balance");
            return;
        }

        debit(amount);
        receiver.getWallet().credit(amount);

        System.out.println("Transferred ₹" + amount + " to " + receiver.getName());
    }
}

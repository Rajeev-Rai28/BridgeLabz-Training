package com.day7.Artify;

public class PrintArt extends Artwork implements IPurchasable {

    public PrintArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    public PrintArt(String title, String artist, double price, String licenseType, String preview) {
        super(title, artist, price, licenseType, preview);
    }

    @Override
    public void purchase(User user) {
        if (user.getWalletBalance() >= price) {
            user.setWalletBalance(user.getWalletBalance() - price);
            System.out.println(user.getName() + " purchased print art: " + title);
        } else {
            System.out.println("Insufficient balance to buy " + title);
        }
    }

    @Override
    public void license() {
        System.out.println("PrintArt License: You can print and frame this art for " + getLicenseType() + " use.");
    }
}

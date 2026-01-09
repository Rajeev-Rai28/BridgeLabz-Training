package com.day6.Artify;

public class DigitalArt extends Artwork implements IPurchasable {

    public DigitalArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
    }

    public DigitalArt(String title, String artist, double price, String licenseType, String preview) {
        super(title, artist, price, licenseType, preview);
    }

    @Override
    public void purchase(User user) {
        if (user.getWalletBalance() >= price) {
            user.setWalletBalance(user.getWalletBalance() - price);
            System.out.println(user.getName() + " purchased digital art: " + title);
        } else {
            System.out.println("Insufficient balance to buy " + title);
        }
    }

    @Override
    public void license() {
        System.out.println("DigitalArt License: You can use this art for " + getLicenseType() + " purposes with watermark.");
    }
}


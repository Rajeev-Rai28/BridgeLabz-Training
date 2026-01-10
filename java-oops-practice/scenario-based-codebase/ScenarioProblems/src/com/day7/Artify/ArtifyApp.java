package com.day7.Artify;

public class ArtifyApp {
    public static void main(String[] args) {

        User user = new User("Rajeev", 5000);

        Artwork art1 = new DigitalArt("Sunset NFT", "Aman", 1500, "Personal");
        Artwork art2 = new PrintArt("Mona Replica", "Ravi", 2000, "Commercial");

        IPurchasable p1 = (IPurchasable) art1;
        IPurchasable p2 = (IPurchasable) art2;

        System.out.println("Wallet Balance Before: " + user.getWalletBalance());

        p1.purchase(user);
        p1.license();

        p2.purchase(user);
        p2.license();

        System.out.println("Wallet Balance After: " + user.getWalletBalance());
    }
}


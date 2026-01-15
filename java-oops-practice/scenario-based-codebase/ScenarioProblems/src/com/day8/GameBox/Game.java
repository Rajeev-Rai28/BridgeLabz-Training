package com.day8.GameBox;

abstract class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    public void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }

    public double getPrice() {
        return price;
    }

    public abstract void playDemo();
}
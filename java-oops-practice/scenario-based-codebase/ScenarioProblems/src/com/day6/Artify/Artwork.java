package com.day6.Artify;

public class Artwork {
    protected String title;
    protected String artist;
    protected double price;
    protected String licenseType;
    protected String preview; // optional

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
    }

    // Constructor with preview
    public Artwork(String title, String artist, double price, String licenseType, String preview) {
        this(title, artist, price, licenseType);
        this.preview = preview;
    }

    public double getPrice() {
        return price;
    }

    protected String getLicenseType() {
        return licenseType;
    }
}

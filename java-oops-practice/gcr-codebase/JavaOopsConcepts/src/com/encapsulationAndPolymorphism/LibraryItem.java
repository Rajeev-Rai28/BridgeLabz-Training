package com.encapsulationAndPolymorphism;

abstract class LibraryItem implements Reservable {
    protected int itemId;
    protected String title;
    protected String author;

    private boolean isAvailable = true;
    private String borrowerName; // encapsulated

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method
    abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("ID: " + itemId +
                ", Title: " + title +
                ", Author: " + author +
                ", Available: " + isAvailable);
    }

    // Interface methods
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            this.borrowerName = borrowerName;
            isAvailable = false;
            System.out.println(title + " reserved by " + borrowerName);
        } else {
            System.out.println(title + " is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}

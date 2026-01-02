package com.encapsulationAndPolymorphism;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        LibraryItem[] items = {
                new Book(1, "Java Programming", "James Gosling"),
                new Magazine(2, "Tech Today", "Editorial Team"),
                new DVD(3, "Inception", "Christopher Nolan")
        };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            item.reserveItem("Rajeev");
            System.out.println();
        }
    }
}

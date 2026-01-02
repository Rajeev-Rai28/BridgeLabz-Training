package com.encapsulationAndPolymorphism;

class Book extends LibraryItem {

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    int getLoanDuration() {
        return 14; // 14 days
    }
}


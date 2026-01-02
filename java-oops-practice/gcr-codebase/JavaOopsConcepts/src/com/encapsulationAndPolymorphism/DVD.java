package com.encapsulationAndPolymorphism;

class DVD extends LibraryItem {

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    int getLoanDuration() {
        return 3; // 3 days
    }
}


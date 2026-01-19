package com.day4.smartShelf;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}


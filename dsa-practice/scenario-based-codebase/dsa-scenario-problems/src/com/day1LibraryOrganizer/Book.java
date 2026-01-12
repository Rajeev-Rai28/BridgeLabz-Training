package com.day1LibraryOrganizer;

class Book {
    int id;
    String title;
    String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Needed for HashSet duplicate check
    @Override
    public boolean equals(Object o) {
        Book b = (Book) o;
        return this.id == b.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public String toString() {
        return id + " - " + title + " by " + author;
    }
}

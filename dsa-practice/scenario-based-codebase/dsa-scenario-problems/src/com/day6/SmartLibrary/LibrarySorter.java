package com.day6.SmartLibrary;

public class LibrarySorter {

    // Insertion Sort by book title (alphabetical order)
    public static void insertionSort(Book[] books) {

        int n = books.length;

        for (int i = 1; i < n; i++) {

            Book key = books[i];
            int j = i - 1;

            // Shift books that are alphabetically after 'key'
            while (j >= 0 && books[j].getTitle().compareTo(key.getTitle()) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            // Insert at correct position
            books[j + 1] = key;
        }
    }
}


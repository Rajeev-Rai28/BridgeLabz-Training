package com.day4.smartShelf;

class SmartShelf {

    public static void insertionSort(Book[] books) {
        int n = books.length;

        for (int i = 1; i < n; i++) {
            Book key = books[i];
            int j = i - 1;

            // Shift larger titles to right
            while (j >= 0 && books[j].title.compareTo(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }
}

package com.day6.artExpo;

public class RegistrationManager {

    // Insertion Sort by registration time (ascending)
    public static void insertionSort(Artist[] artists) {

        int n = artists.length;

        for (int i = 1; i < n; i++) {

            Artist key = artists[i];
            int j = i - 1;

            // Shift artists who registered later to the right
            while (j >= 0 && artists[j].getRegistrationTime() > key.getRegistrationTime()) {
                artists[j + 1] = artists[j];
                j--;
            }

            // Insert at correct position
            artists[j + 1] = key;
        }
    }
}

package com.day5.cinemHouse;

public class ShowManager {

    // Bubble Sort by show time (ascending)
    public static void bubbleSort(MovieShow[] shows) {

        int n = shows.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                if (shows[j].getShowTime() > shows[j + 1].getShowTime()) {

                    // swap
                    MovieShow temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swap, already sorted
            if (!swapped) {
                break;
            }
        }
    }
}

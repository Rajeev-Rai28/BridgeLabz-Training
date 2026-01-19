package com.day6.IceCreamRush;

public class FlavorSorter {

    // Bubble Sort by soldCount (descending: most popular first)
    public static void bubbleSort(IceCreamFlavor[] flavors) {

        int n = flavors.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

                // If current sold count is less than next, swap
                if (flavors[j].getSoldCount() < flavors[j + 1].getSoldCount()) {

                    IceCreamFlavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: if no swap, already sorted
            if (!swapped) {
                break;
            }
        }
    }
}


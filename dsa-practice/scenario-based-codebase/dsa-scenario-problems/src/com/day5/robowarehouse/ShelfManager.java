package com.day5.robowarehouse;

public class ShelfManager {

    // Insertion Sort by weight (ascending)
    public static void insertionSort(PackageItem[] packages) {

        int n = packages.length;

        for (int i = 1; i < n; i++) {

            PackageItem key = packages[i];
            int j = i - 1;

            // Shift heavier packages to the right
            while (j >= 0 && packages[j].getWeight() > key.getWeight()) {
                packages[j + 1] = packages[j];
                j--;
            }

            // Insert at correct position
            packages[j + 1] = key;
        }
    }
}


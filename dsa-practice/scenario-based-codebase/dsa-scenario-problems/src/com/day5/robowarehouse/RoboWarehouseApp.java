package com.day5.robowarehouse;

public class RoboWarehouseApp {

    public static void main(String[] args) {

        PackageItem[] packages = {
            new PackageItem(50),
            new PackageItem(10),
            new PackageItem(40),
            new PackageItem(20),
            new PackageItem(30)
        };

        System.out.println("Before Sorting:");
        for (PackageItem p : packages) {
            System.out.println(p);
        }

        ShelfManager.insertionSort(packages);

        System.out.println("\nAfter Sorting (By Weight Ascending):");
        for (PackageItem p : packages) {
            System.out.println(p);
        }
    }
}


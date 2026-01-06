package com.Sorting.CountingSort;

public class CountingSortStudentAges {

    public static void main(String[] args) {

        int[] ages = {12, 15, 11, 18, 14, 10, 13, 15};

        countingSort(ages);

        System.out.println("Sorted Student Ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }

    static void countingSort(int[] arr) {
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];
        int[] output = new int[arr.length];

        // Store frequency
        for (int age : arr) {
            count[age - minAge]++;
        }

        // Cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Build output array (stable)
        for (int i = arr.length - 1; i >= 0; i--) {
            int age = arr[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        // Copy back
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
}
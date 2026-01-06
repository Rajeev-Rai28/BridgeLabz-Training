package com.Sorting.InsertionSort;

public class InsertionSortEmployeeIDs {

    public static void main(String[] args) {

        int[] employeeIds = {105, 101, 109, 103, 102};

        insertionSort(employeeIds);

        System.out.println("Sorted Employee IDs:");
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at correct position
            arr[j + 1] = key;
        }
    }
}
package com.day5.cropMonitor;

public class DataSorter {

    // Quick Sort by timestamp (ascending)
    public static void quickSort(SensorData[] arr, int low, int high) {
        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(SensorData[] arr, int low, int high) {

        long pivot = arr[high].getTimestamp(); // pivot = last element
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].getTimestamp() < pivot) {
                i++;

                // swap arr[i] and arr[j]
                SensorData temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        SensorData temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

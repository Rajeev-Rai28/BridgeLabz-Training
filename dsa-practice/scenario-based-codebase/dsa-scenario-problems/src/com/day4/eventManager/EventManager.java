package com.day4.eventManager;

class EventManager {

    public static void quickSort(Ticket[] arr, int low, int high) {
        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(Ticket[] arr, int low, int high) {

        int pivot = arr[high].price; // pivot = last element
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].price < pivot) {
                i++;

                // swap arr[i] and arr[j]
                Ticket temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        Ticket temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

package com.Sorting.BubbleSort;

public class BubbleSortStudentMarks {

    public static void main(String[] args) {

        int[] marks = {78, 45, 90, 66, 82};

        bubbleSort(marks);

        System.out.println("Sorted Student Marks:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // if no swap, array is already sorted
            if (!swapped)
                break;
        }
    }
}

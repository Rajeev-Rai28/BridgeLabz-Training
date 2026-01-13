package com.Searching.BinarySearch.FindThePeakElement;

public class PeakElementBinarySearch {

    public static int findPeak(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Handle boundaries safely
            boolean leftSmaller = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightSmaller = (mid == n - 1) || (arr[mid] > arr[mid + 1]);

            // If both sides are smaller, mid is peak
            if (leftSmaller && rightSmaller) {
                return mid;  // index of peak
            }

            // If left neighbor is greater, go left
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            // Else go right
            else {
                left = mid + 1;
            }
        }

        return -1; // never reached (peak always exists)
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeak(arr);

        System.out.println("Peak found at index: " + peakIndex);
        System.out.println("Peak element is: " + arr[peakIndex]);
    }
}


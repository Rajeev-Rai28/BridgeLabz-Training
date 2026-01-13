package com.Searching.BinarySearch.findFirstAndLastOccurence;

public class FirstAndLastOccurrence {

    // Find first occurrence
    public static int findFirst(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;          // store answer
                right = mid - 1;    // go left
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return ans;
    }

    // Find last occurrence
    public static int findLast(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;          // store answer
                left = mid + 1;     // go right
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 4, 4, 6, 7, 8};
        int target = 4;

        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}


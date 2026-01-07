package com.ChallengeProblems.FirstMissingPositiveInteger;

import java.util.Arrays;

public class LinearAndBinarySearchChallenge {

    public static void main(String[] args) {

        int[] arr = {3, 4, -1, 1};
        int target = 4;

        int missing = firstMissingPositive(arr);
        System.out.println("First Missing Positive Integer: " + missing);

        int index = binarySearch(arr, target);
        System.out.println("Index of " + target + ": " + index);
    }

    //  LINEAR SEARCH 
    public static int firstMissingPositive(int[] arr) {

        int n = arr.length;
        boolean[] present = new boolean[n + 2];

        for (int num : arr) {
            if (num > 0 && num <= n + 1) {
                present[num] = true;
            }
        }

        for (int i = 1; i <= n + 1; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return -1;
    }

//BINARY SEARCH

    public static int binarySearch(int[] arr, int target) {

        Arrays.sort(arr); 

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } 
            else if (arr[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

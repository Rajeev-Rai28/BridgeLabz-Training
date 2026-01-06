package com.stackandqueue.SlidingWindowMaximum;

import java.util.Arrays;

public class SlidingWindowMain {
    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = SlidingWindowMaximum.maxSlidingWindow(nums, k);

        System.out.println("Array  : " + Arrays.toString(nums));
        System.out.println("Window : " + k);
        System.out.println("Maxima : " + Arrays.toString(result));
    }
}

package com.stackandqueue.StockSpanProblem;

import java.util.Arrays;

public class StockSpanMain {
    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] span = StockSpan.calculateSpan(prices);

        System.out.println("Stock Prices: " + Arrays.toString(prices));
        System.out.println("Span Values : " + Arrays.toString(span));
    }
}
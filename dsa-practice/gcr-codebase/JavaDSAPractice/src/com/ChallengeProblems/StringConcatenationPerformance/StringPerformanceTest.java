package com.ChallengeProblems.StringConcatenationPerformance;


public class StringPerformanceTest {

    public static void main(String[] args) {

        int iterations = 1_000_000;
        String text = "hello";

        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;


        long startBuffer = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();

        for (int i = 0; i < iterations; i++) {
            sbuf.append(text);
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        System.out.println("StringBuilder Time (ns): " + builderTime);
        System.out.println("StringBuffer Time (ns): " + bufferTime);
    }
}

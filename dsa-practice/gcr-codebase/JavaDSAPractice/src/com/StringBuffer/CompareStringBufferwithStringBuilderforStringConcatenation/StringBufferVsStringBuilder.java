package com.StringBuffer.CompareStringBufferwithStringBuilderforStringConcatenation;


public class StringBufferVsStringBuilder {

    public static void main(String[] args) {

        int count = 1_000_000;

        long startBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < count; i++) {
            stringBuffer.append("hello");
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        long startBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            stringBuilder.append("hello");
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        System.out.println("StringBuffer Time (ns): " + bufferTime);
        System.out.println("StringBuilder Time (ns): " + builderTime);
    }
}

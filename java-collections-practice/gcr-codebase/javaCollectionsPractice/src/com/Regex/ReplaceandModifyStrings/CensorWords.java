package com.Regex.ReplaceandModifyStrings;

public class CensorWords {
    public static void main(String[] args) {

        String text = "This is a damn bad example with some stupid words.";

        String regex = "\\b(damn|stupid)\\b";

        String censored = text.replaceAll(regex, "****");

        System.out.println(censored);
    }
}
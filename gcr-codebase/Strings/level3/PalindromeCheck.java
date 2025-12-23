/*
Write a program to check if a text is palindrome
using three different logics.
*/

import java.util.Scanner;

public class PalindromeCheck {

    // Method to find length without using length()
    public int findLength(String str) {

        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // End of string
        }
        return count;
    }

    // LOGIC 1 
    // Iterative comparison using start & end indexes
    public boolean isPalindromeLogic1(String text) {

        int start = 0;
        int end = findLength(text) - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // LOGIC 2
    // Recursive palindrome check
    public boolean isPalindromeLogic2(String text, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeLogic2(text, start + 1, end - 1);
    }

    // LOGIC 3 
    // Using character arrays
    public char[] reverseString(String text) {

        int length = findLength(text);
        char[] reverse = new char[length];

        int index = 0;
        for (int i = length - 1; i >= 0; i--) {
            reverse[index++] = text.charAt(i);
        }

        return reverse;
    }

    public boolean isPalindromeLogic3(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        PalindromeCheck obj = new PalindromeCheck();

        // Logic 1
        boolean result1 = obj.isPalindromeLogic1(input);

        // Logic 2
        boolean result2 = obj.isPalindromeLogic2(
                input, 0, obj.findLength(input) - 1);

        // Logic 3
        boolean result3 = obj.isPalindromeLogic3(input);

        // Display results
        System.out.println("\nPalindrome Check Results:");
        System.out.println("----------------------------");
        System.out.println("Logic 1 (Iterative) : " + result1);
        System.out.println("Logic 2 (Recursive) : " + result2);
        System.out.println("Logic 3 (Array)     : " + result3);

        sc.close();
    }
}

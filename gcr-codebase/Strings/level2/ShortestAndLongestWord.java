/*
Write a program to split the text into words and
find the shortest and longest strings in a given text.
*/

import java.util.Scanner;

public class ShortestAndLongestWord {

    // Method to find length of string without using length()
    public int findLength(String str) {

        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Exception occurs when index goes out of range
        }
        return count;
    }

    // Method to split text into words without using split()
    public String[] splitText(String text) {

        int length = findLength(text);
        int wordCount = 1;

        // Count words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[index++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }

        // Last word
        words[wordCount - 1] = text.substring(start);

        return words;
    }

    // Method to create 2D array of word and its length
    public String[][] createWordLengthArray(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    // Method to find shortest and longest word indexes
    // returns int array: [shortestIndex, longestIndex]
    public int[] findShortestAndLongest(String[][] data) {

        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < data.length; i++) {

            int currentLength = Integer.parseInt(data[i][1]);
            int shortestLength = Integer.parseInt(data[shortestIndex][1]);
            int longestLength = Integer.parseInt(data[longestIndex][1]);

            if (currentLength < shortestLength) {
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Create object
        ShortestAndLongestWord obj = new ShortestAndLongestWord();

        // Split text into words
        String[] words = obj.splitText(text);

        // Create 2D array of word and length
        String[][] data = obj.createWordLengthArray(words);

        // Find shortest and longest word
        int[] result = obj.findShortestAndLongest(data);

        // Display all words with lengths
        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + Integer.parseInt(data[i][1]));
        }

        // Display result
        System.out.println("\nShortest Word : " + data[result[0]][0]);
        System.out.println("Longest Word  : " + data[result[1]][0]);

        sc.close();
    }
}

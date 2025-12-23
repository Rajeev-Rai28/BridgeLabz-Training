import java.util.Scanner;

public class LongestWordInSentence {

    public static String findLongestWord(String str) {

        String longestWord = "";
        String currentWord = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                currentWord = currentWord + ch;
            } else {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = "";
            }
        }

        // check last word
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
        }

        return longestWord;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String str = sc.nextLine();   // sentence input

        String result = findLongestWord(str);

        System.out.println("Longest word : " + result);
    }
}

import java.util.Scanner;

public class ReplaceWordInSentence {

    public static String replaceWord(String sentence, String oldWord, String newWord) {

        String result = "";
        int i = 0;

        while (i < sentence.length()) {

            if (i <= sentence.length() - oldWord.length() &&
                sentence.substring(i, i + oldWord.length()).equals(oldWord)) {

                result = result + newWord;
                i = i + oldWord.length();
            } 
            else {
                result = result + sentence.charAt(i);
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence : ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace : ");
        String oldWord = sc.next();

        System.out.print("Enter new word : ");
        String newWord = sc.next();

        String output = replaceWord(sentence, oldWord, newWord);

        System.out.println("Modified Sentence : " + output);
    }
}

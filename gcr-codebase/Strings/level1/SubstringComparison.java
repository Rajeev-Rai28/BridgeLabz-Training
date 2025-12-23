/* Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
Hint => 
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
*/

import java.util.Scanner;

public class SubstringComparison {

    // Create substring using charAt()
    static String substringUsingCharAt(String text, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) {
            sub += text.charAt(i);
        }
        return sub;
    }

    // Compare two strings
    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Text : ");
        String text = sc.next();
		System.out.print("Enter a start : ");
        int start = sc.nextInt();
		System.out.print("Enter a End : ");
        int end = sc.nextInt();

        String sub1 = substringUsingCharAt(text, start, end);
        String sub2 = text.substring(start, end);

		System.out.println("SubString 1 : "+sub1);
		System.out.println("SubString 2 : "+sub2);
        System.out.println("Result same? " + compareStrings(sub1, sub2));
    }
}

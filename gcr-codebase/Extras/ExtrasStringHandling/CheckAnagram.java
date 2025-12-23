import java.util.Scanner;

public class CheckAnagram {

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int[] count = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string : ");
        String str1 = sc.next();

        System.out.print("Enter second string : ");
        String str2 = sc.next();

        if (isAnagram(str1, str2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are NOT Anagrams");
        }
    }
}

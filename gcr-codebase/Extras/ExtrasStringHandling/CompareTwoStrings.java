import java.util.Scanner;

public class CompareTwoStrings {

    public static int compareString(String str1, String str2) {

        int len = Math.min(str1.length(), str2.length());

        for (int i = 0; i < len; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 != ch2) {
                return ch1 - ch2;
            }
        }

        return str1.length() - str2.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string : ");
        String str1 = sc.next();

        System.out.print("Enter second string : ");
        String str2 = sc.next();

        int result = compareString(str1, str2);

        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        }
        else if (result > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
        }
        else {
            System.out.println("Both strings are equal");
        }
    }
}

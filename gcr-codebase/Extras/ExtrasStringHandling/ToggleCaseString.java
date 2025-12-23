import java.util.Scanner;

public class ToggleCaseString {

    public static String toggleCase(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32);
            }
            else if (ch >= 'a' && ch <= 'z') {
                result = result + (char)(ch - 32);
            }
            else {
                result = result + ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        String output = toggleCase(str);

        System.out.println("After toggle case : " + output);
    }
}

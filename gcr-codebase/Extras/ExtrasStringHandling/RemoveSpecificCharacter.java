import java.util.Scanner;

public class RemoveSpecificCharacter {

    public static String removeCharacter(String str, char removeChar) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != removeChar) {
                result = result + ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        System.out.print("Enter character to remove : ");
        char removeChar = sc.next().charAt(0);

        String output = removeCharacter(str, removeChar);

        System.out.println("Modified String : " + output);
    }
}

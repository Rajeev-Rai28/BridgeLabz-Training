import java.util.Scanner;

public class SubstringOccurrenceCount {

    public static int findOccurrence(String str, String sub) {

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length();
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string : ");
        String str = sc.nextLine();

        System.out.print("Enter substring : ");
        String sub = sc.next();

        int result = findOccurrence(str, sub);

        System.out.println("Substring occurs : " + result + " times");
    }
}

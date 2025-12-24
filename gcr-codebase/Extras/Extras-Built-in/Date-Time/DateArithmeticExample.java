import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmeticExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking date input
        System.out.print("Enter date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(sc.next());

        // Adding days, months, and years
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtracting weeks
        updatedDate = updatedDate.minusWeeks(3);

        // Display result
        System.out.println("Final Date after calculations: " + updatedDate);

        sc.close();
    }
}

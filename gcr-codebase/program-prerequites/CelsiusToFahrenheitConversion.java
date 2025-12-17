import java.util.Scanner;
public class CelsiusToFahrenheitConversion {
	public static void main(String [] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Enter the temperature in Celsius : ");
	       int celsius = sc.nextInt();
	       double fehrenheit = (celsius * 9/5) + 32 ;
               System.out.println(fehrenheit);
	}
}
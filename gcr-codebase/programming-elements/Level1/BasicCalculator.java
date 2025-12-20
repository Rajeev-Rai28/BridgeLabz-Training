//import a Scanner class
import java.util.Scanner;

//create a basic Calculator class
public class BasicCalculator {
	public static void main(String []args){
	
	//create a Scanner object
	Scanner sc = new Scanner(System.in);
	
	//taking input.
	float number1 = sc.nextFloat();
	float number2 = sc.nextFloat();

	//perform arithmetic operations
	float addition = number1 + number2;
	float subtraction = number1 - number2;
	float multiplication = number1 * number2;
	float division = number1 / number2;

        //display the result
	System.out.println("The addition : "+ addition+" ,the subtraction : "+subtraction+", the multiplication : "+multiplication+", the division : "+division);

	sc.close();
	}
}




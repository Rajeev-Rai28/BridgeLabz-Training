//create a class FirstSmallestOrNot
import java.util.Scanner;

public class FirstSmallestOrNot {
	public static void main(String [] args){
	
	//create a scanner object
	Scanner sc = new Scanner(System.in);

	//taking 3 inputs
	System.out.print("Enter the first number : ");
	int number1 = sc.nextInt();
	System.out.print("Enter the second number : ");
	int number2 = sc.nextInt();
	System.out.print("Enter the third number : ");
	int number3 = sc.nextInt();
	
	//we are checking the first number
	if(number1 < number2 && number1 < number2){
	   System.out.print("Is the first number is "+number1+" the smallest Yes");
	   }
	   else {
		System.out.print("Is the first number is "+number1+" the smallest No");
	   }
	}
}



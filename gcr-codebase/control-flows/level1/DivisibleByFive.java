//create a class which is find a number divisible by 5 or not
import java.util.Scanner;

public class DivisibleByFive{
	public static void main(String [] args){
	
	//create a scanner object
	Scanner sc = new Scanner(System.in);

	//taking input
	System.out.print("Enter your number : ");
	int number = sc.nextInt();

	//checking a number which is divisible by 5 or not using if , else
	if(number % 5 == 0){
	   System.out.println("Is the number "+number+" divisible by 5 yes");
	   }
	else{
	     System.out.println("Is the number "+number+" divisible by 5 No");
	    }
	}
}

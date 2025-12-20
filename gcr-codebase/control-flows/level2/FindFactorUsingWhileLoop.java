// Creating Class with name FindFactorUsingWhileLoop indicating the purpose is to
// print a factor 1 to number
import java.util.Scanner;
	
public class FindFactorUsingWhileLoop {
	public static void main(String [] args){
	
	//create a scanner object
	Scanner sc = new Scanner(System.in);
	
	//taking input a number
	System.out.print("Enter a Number : ");
	int number = sc.nextInt();
	
	//checking number is positive or not
	if(number < 0){
	   System.out.println("Number is not positive ");
	}
	else{
	    int counter = 1;
	   //print factors from 1 to number
	   while(counter < number){
		if(number % counter == 0){
		   System.out.println(counter);
		}
		   counter++;
	    }
	}
	sc.close();
	}
}

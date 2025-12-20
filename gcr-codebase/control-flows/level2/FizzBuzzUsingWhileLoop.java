// Creating Class with name FizzBuzz indicating the purpose is to
// print a Fizz, Buzz, and FizzBuzz using while loop
import java.util.Scanner;
	
public class FizzBuzzUsingWhileLoop {
	public static void main(String [] args){
	
	//create a scanner object
	Scanner sc = new Scanner(System.in);
	
	//taking input a number
	System.out.print("Enter a Number : ");
	int number = sc.nextInt();
	
	//fulfill using for loop
	int count = 1;
	while(count <= number){
	    if(count % 3 == 0 && count % 5 == 0){
	       System.out.println("FizzBuzz");
	       
	    }
	    else if(count % 5 == 0){
	       System.out.println("Buzz");
	       
	    }
	    else if(count % 3 == 0){
	       System.out.println("Fizz");
	       
	    }
	    else{
	       System.out.print(count);
	       
	    }
	}
	sc.close();
	}
}

	
	
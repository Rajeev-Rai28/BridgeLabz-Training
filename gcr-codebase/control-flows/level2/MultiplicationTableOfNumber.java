// Creating Class with name MultiplicationTableOfNumber indicating the purpose is to
// which print table given by number
import java.util.Scanner;

public class MultiplicationTableOfNumber {
	public static void main(String [] args){
	
	//create a scanner object 
	Scanner sc = new Scanner(System.in);
	//taking input as number
	System.out.print("Enter a number between 6 to 9 : ");
	int number = sc.nextInt();
	
	//checking a number is between 6 to 9
	while(true){
	      if(number >= 6 && number <= 9){
		break;
	       }
	       System.out.print("Enter a number between 6 to 9 : ");
	       number = sc.nextInt();
	}

	//printing a table using for loop
	for(int i = 1; i<=10; i++){
	    System.out.println(number+" * "+ i +" = "+number*i);
	}
	sc.close();
	}
}
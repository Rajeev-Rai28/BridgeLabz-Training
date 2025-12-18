// creating a class which finds person is eligible or not
import java.util.Scanner;

public class IsPersonVotingEligible {
	public static void main(String [] args){
	
	//create a Scanner object
	Scanner sc = new Scanner(System.in);
	
	//taking input as age
	System.out.print("Enter your age : ");
	int age = sc.nextInt();
	
	//check person can do voting or not
	if(age >= 18){
	   System.out.print("The person's age is "+age+" and can vote");
	}
	else{
	   System.out.print("The person's age is "+age+" and cannot vote");
	}
	sc.close();
	}
}
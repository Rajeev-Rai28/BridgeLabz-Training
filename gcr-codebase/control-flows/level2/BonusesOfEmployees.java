// Creating Class with name BonusesOfEmployees indicating the purpose is to 
// find the bonus based on salary and service year
import java.util.Scanner;

public class BonusesOfEmployees {
	public static void main(String [] args){
	
	//create a scanner object
	Scanner sc = new Scanner(System.in);
	
	//Take salary and year of service in the year as input.
	System.out.print("Enter your Salary : ");
	double salary = sc.nextDouble();
	System.out.print("Enter your service year : ");
	double serviceYear = sc.nextDouble();
	double bonus;

	if(serviceYear > 5){
	   bonus = (salary * 5)/100;
	   System.out.print("Bonus amount is : "+bonus);
	}
	else{
	   System.out.print("You are not eligible for bonus amount");
	}
	sc.close();
	}
}
	

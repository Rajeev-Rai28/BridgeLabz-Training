//import a Scanner class 

import java.util.Scanner;
public class FeeOfUniversityUserInput {
	public static void main(String [] args) {

	//create a Scanner object
	Scanner sc = new Scanner(System.in);

	//taking input
	System.out.print("Enter a total fee : ");
	double fee = sc.nextDouble();
	System.out.print("Enter a Discount Percent : ");
	double discountPercent = sc.nextDouble();

	//compute a discount and discounted fee	
	double discount = (fee *discountPercent) / 100;
	double discountedFee = fee - discount;

	System.out.println("The discount amount is INR "+ discount+" and final discounted fee is INR "+ discountedFee);
	}
}

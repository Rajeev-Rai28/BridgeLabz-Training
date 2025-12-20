public class FeeOfUniversity {
	public static void main(String [] args) {
	//predefine input
	int fee = 125000;
	int discountPercent = 10;
	
	int discount = (fee *discountPercent) / 100;
	int discountedFee = fee - discount;

	System.out.println("The discount amount is INR "+ discount+" and final discount fee is INR "+ discountedFee);
	}
}

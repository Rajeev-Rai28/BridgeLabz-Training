//Create a program to calculate the profit and loss in number and percentage
public class FindProfitLossAndPercentage {
	public static void main(String []args) {
	
	//intialize a inputs like cost price and selling price in INR
	double costPrice = 129;
	double sellingPrice = 191;

	//we calculate profit, loss, and percentage.
	double profit = sellingPrice - costPrice;
	double profitPercentage = (profit / costPrice) * 100;
	System.out.print("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+ "\nThe Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);
	   

	}
}


	

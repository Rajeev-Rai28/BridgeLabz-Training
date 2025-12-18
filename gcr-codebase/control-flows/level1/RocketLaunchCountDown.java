import java.util.Scanner;

public class RocketLaunchCountDown {
	public static void main(String [] args){
	
	//create a Scanner object
	Scanner sc = new Scanner(System.in);
	
	//taking input
	System.out.print("Enter a count down number : ");
	int num = sc.nextInt();
	
	while(num >= 1){
		System.out.println(num);
		num--;
	     }
	sc.close();
	}
}

	
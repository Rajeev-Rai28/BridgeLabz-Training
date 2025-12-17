import java.util.Scanner;
public class AreaOfACircle {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a radius of a circle : ");
	int rad = sc.nextInt();
	// we can use pi in a math class or we can initialize a pi with value of 3.14
	double pi = 3.14;
	double areaOfCircle = pi*rad*rad;
	System.out.print("Area of a circle is : "+ areaOfCircle);
	
	}
}
import java.util.Scanner;
public class VolumeOfCylinder {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a radius of cylinder : ");
	int rad = sc.nextInt();
	System.out.print("Enter a height of cylinder : ");
	int height = sc.nextInt();
	double volume = 3.14 * rad * rad * height;
	System.out.print("Volume of a cylinder : "+ volume);
	}
}
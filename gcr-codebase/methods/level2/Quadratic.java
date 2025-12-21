/* Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
Hint => 
Take a, b, and c as input values to find the roots of x.
The roots are computed using the following formulae
delta = b2+ 4*a*c
If delta is positive the find the two roots using formulae 
root1 of x = (-b + delta)/(2*a) 
root1 of x = (-b - delta)/(2*a)
If delta is zero then there is only one root of x  
root of x = -b/(2*a)
If delta is negative return empty array or nothing 
*/

//create a class Quadratic
import java.util.Scanner;
public class Quadratic {

    // Method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {

        // Calculate discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is positive → two real roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }

        // If delta is zero → one real root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        // If delta is negative → no real roots
        else {
            return new double[]{}; // empty array
        }
    }

    public static void main(String[] args) {

		//create Scanner object
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Call method
        double[] roots = findRoots(a, b, c);

        // display Output
        if (roots.length == 2) {
            System.out.println("Two roots are:");
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("One root is:");
            System.out.println("Root = " + roots[0]);
        } else {
            System.out.println("No real roots exist.");
        }

        sc.close();
    }
}

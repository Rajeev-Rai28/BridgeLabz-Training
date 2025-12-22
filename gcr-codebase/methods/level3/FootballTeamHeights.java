/* Create a program to find the shortest, tallest, and mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements/number of elements
Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
Write the method to Find the sum of all the elements present in the array.
Write the method to find the mean height of the players on the football team
Write the method to find the shortest height of the players on the football team 
Write the method to find the tallest height of the players on the football team
Finally display the results
*/



import java.util.Random;

public class FootballTeamHeights {

    // Method to generate random heights between 150 and 250 cm
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random random = new Random();

		int max = 250;
		int min = 150;
        // Generate random height for each player
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(max - min +1) + min; // 150 to 250
        }
        return heights;
    }

    // Method to find sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;

        // Add all elements of the array
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find mean (average) height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];

        // Compare each height to find minimum
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];

        // Compare each height to find maximum
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    // Main method
    public static void main(String[] args) {

        // Create array of size 11 for football players
        int[] heights = generateHeights(11);

        // Display player heights
        System.out.println("Heights of football players (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }

        // Call methods and display results
        System.out.println("\n\nShortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.printf("Mean Height: %.2f%n" , findMean(heights) , " cm");
    }
}

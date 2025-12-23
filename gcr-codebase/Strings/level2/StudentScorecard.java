/*
Create a program to take input marks of students in
Physics, Chemistry, and Maths. Compute total, average,
percentage, and grade.
*/

public class StudentScorecard {

    // Method to generate random 2-digit PCM scores
    // Returns 2D array: [student][P, C, M]
    public int[][] generateScores(int students) {

        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + (int)(Math.random() * 90);
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    // Returns 2D double array
    public double[][] calculateResult(int[][] scores) {

        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 digits
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to calculate grade based on percentage
    public String[] calculateGrade(double[][] result) {

        String[] grade = new String[result.length];

        for (int i = 0; i < result.length; i++) {

            double percent = result[i][2];

            if (percent >= 80)
                grade[i] = "A";
            else if (percent >= 70)
                grade[i] = "B";
            else if (percent >= 60)
                grade[i] = "C";
            else if (percent >= 50)
                grade[i] = "D";
            else if (percent >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }
        return grade;
    }

    // Method to display scorecard in tabular format
    public void displayScorecard(int[][] scores, double[][] result, String[] grade) {

        System.out.println("\nStu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {

            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int)result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grade[i]);
        }
    }

    public static void main(String[] args) {

        int students = 5;

        StudentScorecard obj = new StudentScorecard();

        // Generate PCM scores
        int[][] scores = obj.generateScores(students);

        // Calculate total, average, percentage
        double[][] result = obj.calculateResult(scores);

        // Calculate grade
        String[] grade = obj.calculateGrade(result);

        // Display final scorecard
        obj.displayScorecard(scores, result, grade);
    }
}

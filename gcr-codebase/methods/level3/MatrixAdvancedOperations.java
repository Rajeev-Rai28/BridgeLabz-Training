/*
Write a program to perform matrix operations like
transpose, determinant, and inverse using random matrices.
*/

public class MatrixAdvancedOperations {

    // Method to create random matrix
    public double[][] createMatrix(int rows, int cols) {

        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 1 + (int)(Math.random() * 9);
            }
        }
        return matrix;
    }

    // Method to find transpose
    public double[][] transpose(double[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] result = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Method to find determinant of 2x2 matrix
    public double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Method to find determinant of 3x3 matrix
    public double determinant3x3(double[][] m) {

        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Method to find inverse of 2x2 matrix
    public double[][] inverse2x2(double[][] m) {

        double det = determinant2x2(m);
        double[][] inv = new double[2][2];

        if (det != 0) {
            inv[0][0] = m[1][1] / det;
            inv[0][1] = -m[0][1] / det;
            inv[1][0] = -m[1][0] / det;
            inv[1][1] = m[0][0] / det;
        }
        return inv;
    }

    // Method to display matrix
    public void displayMatrix(double[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%.2f\t", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        MatrixAdvancedOperations obj = new MatrixAdvancedOperations();

        // Create 3x3 matrix
        double[][] matrix = obj.createMatrix(3, 3);

        System.out.println("Original Matrix:");
        obj.displayMatrix(matrix);

        // Transpose
        System.out.println("\nTranspose Matrix:");
        double[][] trans = obj.transpose(matrix);
        obj.displayMatrix(trans);

        // Determinant of 3x3
        double det3 = obj.determinant3x3(matrix);
        System.out.println("\nDeterminant of 3x3 Matrix: " + det3);

        // Create 2x2 matrix
        double[][] matrix2 = obj.createMatrix(2, 2);

        System.out.println("\n2x2 Matrix:");
        obj.displayMatrix(matrix2);

        // Determinant of 2x2
        double det2 = obj.determinant2x2(matrix2);
        System.out.println("\nDeterminant of 2x2 Matrix: " + det2);

        // Inverse of 2x2
        if (det2 != 0) {
            System.out.println("\nInverse of 2x2 Matrix:");
            double[][] inv = obj.inverse2x2(matrix2);
            obj.displayMatrix(inv);
        } else {
            System.out.println("\nInverse not possible (Determinant is 0)");
        }
    }
}

/*
Write a program to perform matrix manipulation operations
like addition, subtraction, and multiplication using random matrices.
*/

public class MatrixOperations {

    // Method to create a random matrix
    public int[][] createMatrix(int rows, int cols) {

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                // Random values between 1 and 9
                matrix[i][j] = 1 + (int)(Math.random() * 9);
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public int[][] addMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public int[][] subtractMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public int[][] multiplyMatrices(int[][] A, int[][] B) {

        int rows = A.length;
        int cols = B[0].length;
        int common = B.length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to display matrix
    public void displayMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        MatrixOperations obj = new MatrixOperations();

        int rows = 2;
        int cols = 2;

        // Create random matrices
        int[][] matrixA = obj.createMatrix(rows, cols);
        int[][] matrixB = obj.createMatrix(rows, cols);

        System.out.println("Matrix A:");
        obj.displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        obj.displayMatrix(matrixB);

        // Addition
        System.out.println("\nAddition of Matrices:");
        int[][] add = obj.addMatrices(matrixA, matrixB);
        obj.displayMatrix(add);

        // Subtraction
        System.out.println("\nSubtraction of Matrices:");
        int[][] sub = obj.subtractMatrices(matrixA, matrixB);
        obj.displayMatrix(sub);

        // Multiplication
        System.out.println("\nMultiplication of Matrices:");
        int[][] mul = obj.multiplyMatrices(matrixA, matrixB);
        obj.displayMatrix(mul);
    }
}
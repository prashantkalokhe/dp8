package com.array2d;
/*
 * 7.	WAP to check if a matrix is a Sparse matrix 
 * (in which most of the elements are 0). Print “Sparse” if it is Sparse else print “Not sparse”
 */
import java.util.Scanner;

public class SparseMatrixChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Check if the matrix is sparse
        if (isSparseMatrix(matrix)) {
            System.out.println("Sparse");
        } else {
            System.out.println("Not sparse");
        }

        scanner.close();
    }

    public static boolean isSparseMatrix(int[][] matrix) {
        int zeroCount = 0;
        int totalElements = matrix.length * matrix[0].length;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;
                }
            }
        }

        // Define a threshold for sparsity (e.g., 50%)
        double sparsityThreshold = 0.5;

        return ((double) zeroCount / totalElements) > sparsityThreshold;
    }
}

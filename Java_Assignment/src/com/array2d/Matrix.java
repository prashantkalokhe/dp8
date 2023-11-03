package com.array2d;

import java.util.Scanner;

class Matrix {
    private int[][] data;

    public Matrix(int rows, int columns) {
        data = new int[rows][columns];
    }

    public void setElement(int row, int col, int value) {
        data[row][col] = value;
    }

    public boolean isSparseMatrix() {
        int zeroCount = 0;
        int totalElements = data.length * data[0].length;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == 0) {
                    zeroCount++;
                }
            }
        }

        // Define a threshold for sparsity (e.g., 50%)
        double sparsityThreshold = 0.5;

        return ((double) zeroCount / totalElements) > sparsityThreshold;
    }
}

public class SparseMatrixChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        Matrix matrix = new Matrix(rows, columns);

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int value = scanner.nextInt();
                matrix.setElement(i, j, value);
            }
        }

        // Check if the matrix is sparse
        if (matrix.isSparseMatrix()) {
            System.out.println("Sparse");
        } else {
            System.out.println("Not sparse");
        }

        scanner.close();
    }
}

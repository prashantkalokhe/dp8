package com.array2d;

import java.util.Scanner;

public class MatrixA {
    private int[][] data;
    private int rows;
    private int columns;

    public MatrixA(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new int[rows][columns];
    }

    public void setElement(int row, int col, int value) {
        data[row][col] = value;
    }

    public int calculateMainDiagonalSum() {
        if (rows != columns) {
            throw new IllegalArgumentException("Matrix is not square");
        }

        int diagonalSum = 0;
        for (int i = 0; i < rows; i++) {
            diagonalSum += data[i][i];
        }

        return diagonalSum;
    }
}

public class MainDiagonalSumUsingObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        if (rows != columns) {
            System.out.println("Matrix must be square for calculating main diagonal sum.");
            return;
        }

        MatrixA matrix = new MatrixA(rows, columns);

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int value = scanner.nextInt();
                matrix.setElement(i, j, value);
            }
        }

        // Calculate the sum of the main diagonal elements
        int diagonalSum = matrix.calculateMainDiagonalSum();
        System.out.println("Sum of the main diagonal elements: " + diagonalSum);

        scanner.close();
    }
}

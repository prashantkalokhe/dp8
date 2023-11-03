package com.array2d;

import java.util.Scanner;

public class MatrixSum {
    private int[][] data;
    private int rows;
    private int columns;

    public MatrixSum(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new int[rows][columns];
    }

    public void setElement(int row, int col, int value) {
        data[row][col] = value;
    }

    public int calculateRowSum(int row) {
        int sum = 0;
        for (int j = 0; j < columns; j++) {
            sum += data[row][j];
        }
        return sum;
    }

    public int calculateColumnSum(int col) {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += data[i][col];
        }
        return sum;
    }
}

public class SumOfRowColumnUsingObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        MatrixSum matrix = new MatrixSum(rows, columns);

        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int value = scanner.nextInt();
                matrix.setElement(i, j, value);
            }
        }

        // Calculate and print the sum of each row
        System.out.println("Row Sums:");
        for (int i = 0; i < rows; i++) {
            int rowSum = matrix.calculateRowSum(i);
            System.out.println("Row " + i + " Sum: " + rowSum);
        }

        // Calculate and print the sum of each column
        System.out.println("Column Sums:");
        for (int j = 0; j < columns; j++) {
            int colSum = matrix.calculateColumnSum(j);
            System.out.println("Column " + j + " Sum: " + colSum);
        }

        scanner.close();
    }
}

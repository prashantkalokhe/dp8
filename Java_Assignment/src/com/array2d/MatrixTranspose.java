package com.array2d;

import java.util.Scanner;

public class Matrix {
    private int[][] data;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new int[rows][columns];
    }

    public void setElement(int row, int col, int value) {
        data[row][col] = value;
    }

    public void transpose() {
        int[][] transposedData = new int[columns][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedData[j][i] = data[i][j];
            }
        }
        
        data = transposedData;
        
        int temp = rows;
        rows = columns;
        columns = temp;
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixTranspose {
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

        System.out.println("Original Matrix:");
        matrix.printMatrix();

        // Transpose the matrix
        matrix.transpose();

        System.out.println("Transposed Matrix:");
        matrix.printMatrix();

        scanner.close();
    }
}

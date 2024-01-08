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


package com.array2d;

import java.util.Arrays;
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

	@Override
	public String toString() {
		return "Matrix [data=" + Arrays.toString(data) + "]";
	}
}


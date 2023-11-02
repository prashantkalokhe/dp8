package com.array2d;

/*
 * 3.	WAP to print minimum in rowwise in 2D array. Means 
 * e.g. arr[][] = 		{{22, 31, 9}, {12, 25, 16}} output is: 9 and 12.
 */
public class MinInRow {
	private int[][] array;

	public MinInRow(int[][] inputArray) {
		array = inputArray;
	}

	public void findMinInEachRow() {
		for (int i = 0; i < array.length; i++) {
			int min = array[i][0];
			for (int j = 1; j < array[i].length; j++) {
				if (array[i][j] < min) {
					min = array[i][j];
				}
			}
			System.out.println("Minimum in row " + (i + 1) + ": " + min);
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 22, 31, 9 }, { 12, 25, 16 }, { 11, 22, 33 } };
		MinInRow maxInRow = new MinInRow(arr);
		maxInRow.findMinInEachRow();
	}
}

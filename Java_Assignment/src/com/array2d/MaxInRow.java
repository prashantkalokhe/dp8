package com.array2d;

/*
 * 3.	WAP to print maximum in rowwise in 2D array. Means 
 * e.g. arr[][] = 		{{22, 31, 9}, {12, 25, 16}} output is: 31 and 25.
 */
public class MaxInRow {
	private int[][] array;

	public MaxInRow(int[][] inputArray) {
		array = inputArray;
	}

	public void findMaxInEachRow() {
		for (int i = 0; i < array.length; i++) {
			int max = array[i][0];
			for (int j = 1; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
			System.out.println("Maximum in row " + (i + 1) + ": " + max);
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 22, 31, 78,8 }, { 12, 25, 16 ,78}, { 11, 22, 33,98 },{ 110, 220, 330,980 } };
		MaxInRow maxInRow = new MaxInRow(arr);
		maxInRow.findMaxInEachRow();
	}
}

package com.array2d;

//2.	WAP to accept data in 2D array where rows are fixed and columns are variable.
import java.util.Scanner;

public class VariableColsArrayInput {
	private int[][] array;

	public VariableColsArrayInput(int rows) {
		array = new int[rows][];
	}

	public void inputData() {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
			int cols = scanner.nextInt();
			array[i] = new int[cols];

			for (int j = 0; j < cols; j++) {
				System.out.print("Enter the element at position (" + (i + 1) + ", " + (j + 1) + "): ");
				array[i][j] = scanner.nextInt();
			}
		}

		scanner.close();
	}

	public void displayArray() {
		System.out.println("The 2D array is:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int rows = scanner.nextInt();

		VariableColsArrayInput arrayInput = new VariableColsArrayInput(rows);
		arrayInput.inputData();
		arrayInput.displayArray();

		scanner.close();
	}
}

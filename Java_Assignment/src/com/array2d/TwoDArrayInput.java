package com.array2d;

//Q1 1.	WAP to accept data in 2D array of 3X4 and accept data
import java.util.Scanner;

public class TwoDArrayInput {

	private int[][] array;

	public TwoDArrayInput(int rows, int cols) {
		array = new int[rows][cols];
	}

	public void inputData() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print("Enter the element at position(" + (i + 1) + "," + (j + 1) + " ):");
				array[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}

	public void displayArray() {
		System.out.println("the 2d array is");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			} //
			System.out.println();

		}

	}

	public static void main(String[] args) {
		TwoDArrayInput obj = new TwoDArrayInput(2, 2);
		obj.inputData();
		obj.displayArray();
	}
}

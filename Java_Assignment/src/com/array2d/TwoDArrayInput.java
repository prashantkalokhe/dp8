package com.array2d;

import java.util.Scanner;

public class TwoDArrayInput {

	private int[][] array;

	public TwoDArrayInput(int rows, int cols) {
		array = new int[rows][cols];
	}

	public void inputData() {
			Scanner sc=new Scanner(System.in);
		
	for(int i = 0;i<array.length;i++)
	{
		for (int j = 0; j < array.length; j++) {
			System.out.print("Enter the element at position(+(i+1 )+," + (j + 1) + "):");
			array[i][j] = sc.nextInt();
		}
	}
	sc.close();
	}
	public void displayArray() {
		
	}


	public static void main(String[] args) {
		TwoDArrayInput obj=new TwoDArrayInput();
		obj.inputData();
		obj.displayArray();
	}
}

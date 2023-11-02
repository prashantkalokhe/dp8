package com.array2d;

import java.util.Scanner;

public class Demo {
public void createArray() {
	
	int arr[][]=new int[4][4];
	
	{
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		
		
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;

		arr[3][3]=8;
		printArray(arr);
		
	}
	}

	public void createArrayUserdefinedValues() {
		int arr[][];
		System.out.println("please enter the size of rows");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		arr = new int[rows][];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the size of " + (i + 1) + " column");
			int col = sc.nextInt();
			arr[i] = new int[col];
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the element ");
				int ele = sc.nextInt();
				arr[i][j] = ele;

			}
		}
		printArray(arr);
	}

	public void printArray(int p[][]) {
		/*
		 * 0 1 2 3 1 4 5 6 2 7 8 9
		 */
		// iterating rows
		for (int i = 0; i < p.length; i++) {
			// iterating column
			for (int j = 0; j < p[i].length; j++) {
				System.out.print(p[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Demo obj = new Demo();
		obj.createArray();
		obj.createArrayUserdefinedValues();
	}

}

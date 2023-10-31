package com.conditional;

import java.util.Scanner;

public class NumtoWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		if (num <= 5 && num >= 1) {
			if (num == 1) {
				System.out.println("One");
			} else if (num == 2) {
				System.out.println("Two");
			} else if (num == 3) {
				System.out.println("Three");
			} else if (num == 4) {
				System.out.println("Four");
			} else if (num == 5) {
				System.out.println("Five");
			}
		} else {
			{
				System.out.println("Out of range");
			}
		}

	}

}

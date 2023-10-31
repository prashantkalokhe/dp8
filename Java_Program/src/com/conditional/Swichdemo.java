package com.conditional;

import java.util.*;

public class Swichdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd number");
		int num2 = sc.nextInt();
		System.out.println("1.Add \n 2.Sub \n 3.Multi \n 4.Division");
		System.out.println("Enter your choice form above Menu");
		int choice = sc.nextInt();

		switch (choice) {
		case 4:
			System.out.println("Division= " + (num1 / num2));
			break;

		case 1:
			System.out.println("Addition= " + (num1 + num2));
			System.out.println(".........");
			System.out.println("////////////////");
			break;

		case 3:
			System.out.println("Multi= " + (num1 * num2));
			break;

		case 2:
			System.out.println("Substraction= " + (num1 - num2));
			break;
		default:
			System.out.println("Invalid choice");

		}

	}

}

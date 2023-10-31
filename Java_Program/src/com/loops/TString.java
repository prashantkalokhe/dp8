//crete the addition,substraction,multiplication,division using string
package com.loops;

import java.util.Scanner;

public class TString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();

		System.out.println("Enter yourchoice (Addition,Substraction,Multiplication,Division ");
		String calculate;
		calculate = sc.next();

		switch (calculate) {
		case "Addition":
			System.out.println("Addition= " + (num1 + num2));
			break;
		case "Substraction":
			System.out.println("Substraction=" + (num1 - num2));
			break;
		case "Multiplication":
			System.out.println("Multiplication= " + (num1 * num2));
			break;
		case "Division":
			System.out.println("Division=" + (num1 / num2));
			break;
		default:
			System.out.println("invalid choice");
		}

	}

}

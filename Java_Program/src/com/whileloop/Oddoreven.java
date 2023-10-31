package com.whileloop;

import java.util.Scanner;

public class Oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		num = sc.nextInt();

		switch (num % 2) {
		case 0:
			System.out.print(num + "is a Even number");
			break;
		case 1:
			System.out.print(num + "is a odd number");

		}

	}
}

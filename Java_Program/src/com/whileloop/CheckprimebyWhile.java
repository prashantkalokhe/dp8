package com.whileloop;

import java.util.Scanner;

public class CheckprimebyWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int i = 2;
		int count = 0;

		while (i < num) {
			if (num % i == 0) {
				count = 1;
				break;
			}
			i++;
		}
		if (count == 0) {
			System.out.print("Prime");
		} else {
			System.out.println("not prime");
		}

	}

}

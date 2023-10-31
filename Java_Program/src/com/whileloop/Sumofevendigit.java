package com.whileloop;

import java.util.Scanner;

public class Sumofevendigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("enter the number");
		num = sc.nextInt();
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			if (rem % 2 != 0) {
				sum = sum + rem;
			}
			num = num / 10;
		}
		System.out.println(sum);

	}

}

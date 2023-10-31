package com.whileloop;

import java.util.Scanner;

public class Sumof1standlastdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num = sc.nextInt();
		int digit;
		int count = 0;
		int a;
		int sum = 0;
		while (num > 0) {
			digit = num % 10;
			count++;
			num = num / 10;
			if (count == 1 || num == 0) {
				sum = sum + digit;
			}
		}
		System.out.println(sum);

	}

}

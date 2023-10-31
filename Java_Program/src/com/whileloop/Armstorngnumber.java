package com.whileloop;

import java.util.Scanner;

public class Armstorngnumber {
	public int sum(int num) {
		int sum = 0;
		int result = 0;
		int temp = num;
		while (num != 0) {
			int rem = num % 10;
			result = rem * rem * rem;
			sum = sum + result;
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Armstorngnumber obj = new Armstorngnumber();
		int rem = obj.sum(num);
		if (rem == num) {
			System.out.println("It is armstrong number");
		} else {
			System.out.println("It is not armstrong number");
		}

	}

}

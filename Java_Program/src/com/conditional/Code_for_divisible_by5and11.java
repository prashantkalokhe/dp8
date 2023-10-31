package com.conditional;

import java.util.Scanner;

public class Code_for_divisible_by5and11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num = sc.nextInt();

		if (num % 5 == 0) {
			System.out.println("number is divisible by5");
		} else {
			System.out.println("number is not divisible by5");
		}
		if (num % 11 == 0) {
			System.out.println("number is divisible by11");
		} else {
			System.out.println("number is not divisible by11");
		}
	}

}
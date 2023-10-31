package com.conditional;

import java.util.*;

public class Code_for_divisible_by3and9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num = sc.nextInt();

		if (num % 3 == 0) {
			System.out.println("number is divisible by3");
		} else {
			System.out.println("number is not divisible by3");
		}
		if (num % 9 == 0) {
			System.out.println("number is divisible by9");
		} else {
			System.out.println("number is not divisible by9");
		}
	}

}

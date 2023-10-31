package com.whileloop;

import java.util.*;

public class Demo2ReverseNum {
//Reverse numbers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int rev = 0;

		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		System.out.println(rev);

	}

}

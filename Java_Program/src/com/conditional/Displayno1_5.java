package com.conditional;

import java.util.*;

public class Displayno1_5 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter NO between 1 to 5");
		num = sc.nextInt();
		if (num <= 5) {
			System.out.println("valid number");
		} else {
			System.out.println("Invalid number");
		}
	}

}

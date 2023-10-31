package com.conditional;

import java.util.*;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int per, year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		per = sc.nextInt();
		System.out.println("Enter the Passout year");
		year = sc.nextInt();

		if (year == 2022) {
			if (per > 60) {
				System.out.println("Selected for interview");
			} else {
				System.out.println("Not selected");
			}
		} else {
			System.out.println("Not selected for interview");
		}

	}

}

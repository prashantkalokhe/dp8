package com.loops;

import java.util.Scanner;

public class Tableofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num = sc.nextInt();
		int table;
		for (int i = 0; i <= 10; i++) {
			table = num * i;
			System.out.println(table);
		}

	}

}

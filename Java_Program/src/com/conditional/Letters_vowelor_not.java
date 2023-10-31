package com.conditional;

import java.util.Scanner;

public class Letters_vowelor_not {
	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		char ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("enter the character " + ch + " is Vowel");
		} else if ((ch >= 'a' && ch <= 'z' || (ch > 'A' && ch <= 'Z')))
			System.out.println("enter the character " + ch + " is constant");
		else
			System.out.println("not an alphabet");
	}
}
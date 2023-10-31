package com.loops;

public class Thinkquotient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0 && i % 5 == 0) {

				System.out.println(i + " =Think Quotient");
			} else if (i % 3 == 0) {
				System.out.println(i + " =Think");
			} else if (i % 5 == 0) {
				System.out.println(i + " =Quotient");
			}
		}

	}

}

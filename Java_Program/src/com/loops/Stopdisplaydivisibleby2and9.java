package com.loops;

public class Stopdisplaydivisibleby2and9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0 && i % 9 == 0) {

				break;

			}

			System.out.println(i);
		}

	}

}

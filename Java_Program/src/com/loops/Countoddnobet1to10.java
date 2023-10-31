package com.loops;

public class Countoddnobet1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				count++;
			}
		}
		System.out.println(count);

	}

}

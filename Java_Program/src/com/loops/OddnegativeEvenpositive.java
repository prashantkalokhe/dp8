package com.loops;

public class OddnegativeEvenpositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i * i);
			} else {
				System.out.println("-" + i);
			}
		}

	}

}
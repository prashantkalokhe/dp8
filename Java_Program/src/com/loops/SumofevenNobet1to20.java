package com.loops;

public class SumofevenNobet1to20 {

	public static int main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}

		}
		return (sum);
	}

}

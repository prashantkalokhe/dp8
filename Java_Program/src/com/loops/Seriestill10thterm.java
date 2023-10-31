package com.loops;

//1,4,9,16,25
public class Seriestill10thterm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		int sum = 1;
		int b = 1;
		for (int i = 1; i < 10; i++) {
			b = b + 2;
			sum = sum + b;
			System.out.println(sum);
		}

	}

}

package com.oop;

public class Multiplication {
	public void multi(float a, int b) {
		System.out.println("this is float");
		System.out.println(a * b);
	}

	public void multi(short a, short b) {
		System.out.println("this is short");
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplication obj=new Multiplication();
		obj.multi(5.5f, 7);
		obj.multi(7, 8);
		
	}

}

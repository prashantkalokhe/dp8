package com.accessmodifiers;

public class A {
	public int a = 6;
	private int b = 20;
	protected int c = 30;

	public int A(int a) {
		return a;
	}
	public class Simple	{
			public void main(String args[]) {
				A obj= new A();
				System.out.println(obj.a);
	
			}
	}
}



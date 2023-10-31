package com.oop;

public class MethodOverloaing {
	public void add(int i,int j)
	{
		System.out.println("i"+(i));
		System.out.println("i"+(j));

		System.out.println("Addition(int,int)"+(i+j));
	}
	public void add(int f1,float f2){
		System.out.println("i"+(f1));
		System.out.println("i"+(f2));
		System.out.println("addition"+(f1+f2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloaing obj=new MethodOverloaing();
		
		obj.add(12, 34);
		obj.add(3, 6.4f);
	}

}

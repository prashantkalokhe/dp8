package com.interface_;

import com.abstraction.Shape;
import com.interface_.Printable;

public class Circle extends Shape implements Printable{

	double r;
	final double pi=3.14;
	public Circle(double r)
	{
		this.r=r;
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return pi*r*r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle obj=new Circle(3.5);
		System.out.println(obj.calculateArea());
		System.out.println(obj.n);
		Shape s=new Circle(3.5);
		Shape arr[]=new Shape[1];
		arr[0]=new Circle(4.5);
		
		
		
		
		
	}	
	public  void show() {
		// TODO Auto-generated method stub
		System.out.println("I am in show of Circle");
	}
}
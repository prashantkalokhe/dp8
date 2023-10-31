package com.interface_;

import com.inheritance.Employee;
import com.inheritance.MyDate;

public class UseInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printable p=new Circle(4.5);
		p.show();
		Printable parr[]=new Printable[3];
		//parr[0]=new Circle(7.8);
		//parr[1]=new Employee();
		parr[2]=new MyDate();
	}

}
package com.inheritance;
/*
 * 6)WAP to create class Programmer with Method workingHours().
 * create class Employee which extends Programmer implement workingHours()differently in child.
 */
public class Programmer {
	int workinghrs;
	public void workinghrs() {
		workinghrs=9;
	}
	
	@Override
	public String toString() {
		return "Programmer [workinghrs=" + workinghrs + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer obj=new Programmer();
		obj.workinghrs();
		System.out.println(obj);

	}

}

package com.inheritance;

public class WageEmp extends Employee {
	double hr,rate;
	public WageEmp()
	{
		
	}
	public WageEmp(int eid,String name, double sal, MyDate d,double h,double rate)
	{
		super(eid,name,sal,d);
		this.hr=h;
		this.rate=rate;
		
	}
	
	@Override
	public String toString() {
		return "WageEmp [hr=" + hr + ", rate=" + rate + "]";
	}
	public double calculateSalary()
	{
		System.out.println("in Wage calculateSalary");
		double s=super.calculateSalary()+hr*rate;
		super.setSalary(s);
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WageEmp we=new WageEmp(123,"ishwar",100000,new MyDate(24,10,2022),45,26);
		System.out.println(we.calculateSalary());
		System.out.println(we);
	}

}

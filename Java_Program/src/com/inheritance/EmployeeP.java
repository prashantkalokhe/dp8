package com.inheritance;

public class EmployeeP extends Programmer{
	int working;
	EmployeeP(){
		working=7;
	}
	public void workingHours(int w)
	{
		this.workinghrs=w;
	}

	@Override
	public String toString() {
		return "EmployeeP [working=" + working + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeP obj= new EmployeeP();
		obj.workingHours(6);
		System.out.println(obj);
	
	}

}

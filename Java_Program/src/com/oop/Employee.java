package com.oop;

//play around the concepts

public class Employee {
	int eid;
	String ename, desg, dname, addr, email;
	long contact;
	double sal;
	boolean fullTimeStatus;

	public void setData(int id, String name, String d, String dnm, String adr, String e, long con, double s,
			boolean status) {
		System.out.println("in setData()");
		eid = id;
		ename = name;
		desg = d;
		dname = dnm;
		addr = adr;
		email = e;
		contact = con;
		sal = s;
		fullTimeStatus = status;

	}

	public void display() {
		System.out.println("Employee id is " + eid);
		System.out.println("Employee name is " + ename);
		System.out.println("Employee designation is " + desg);
		System.out.println("Employee department is " + dname);
		System.out.println("Employee Address is " + addr);
		System.out.println("Employee Email is " + email);
		System.out.println("Employee  contact number is " + contact);
		System.out.println("Employee salary is " + sal);
		System.out.println("Employee Employee fulltime Status is " + fullTimeStatus);
	}

	public void gretestSal(Employee o2) {
		System.out.println(this.sal);
		System.out.println(o2.sal);
		if ((this.sal) > (o2.sal))
			System.out.println("Highest salary is " + this.sal);
		else
			System.out.println("Highest salary is " + o2.sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee();
		obj.setData(1, "prash", "Manager", "Developer", "Pune", "prashantkalokhe@gmail.com", 7385498062l, 100, true);
		obj.display();
		Employee obj1 = new Employee();
		obj1.setData(2, "prakash", "Developer", "HR", "Pune", "prakash23@gmail.com", 1234567856l, 25, true);

		obj.gretestSal(obj1);
	}

}
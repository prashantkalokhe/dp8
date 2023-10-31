package com.containment;
/*1. WAP to have Department class created with id, name . Student class has
roll, name and Department object should have id and name. Assign and
print individual values in main method
*/

public class Student {
	private int rollNo;
	private String name;
	Department dept;

	public Student() {

	}

	Student(int rollNo, String name, Department dept) {
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollno(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollNo + ", name=" + name+ "dept="+dept  ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();

		System.out.println(std);
		Department dept1 = new Department();
		Student std1 = new Student();
		dept1.setId(76);
		dept1.setName("Environmental");

		std1.setRollno(78);
		std1.setName("mahi");
		std1.setDept(dept1);
		System.out.println(std1);

	}
}

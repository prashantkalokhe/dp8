package com.containment;

public class Employee {

	int id;
	String name;
	float salary;
	Dept d;
	MyDate md;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, float salary, Dept d, MyDate md) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.d = d;
		this.md = md;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ",\nd=" + d + ",\nmd=" + md + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Dept getD() {
		return d;
	}

	public void setD(Dept d) {
		this.d = d;
	}

	public MyDate getMd() {
		return md;
	}

	public void setMd(MyDate md) {
		this.md = md;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dept d1 = new Dept(33, "Comp");
		MyDate md1 = new MyDate(8, 10, 2000);
		Employee emp = new Employee(21, "prash kale", 66666, d1, md1);
		System.out.println(emp);
	}

}

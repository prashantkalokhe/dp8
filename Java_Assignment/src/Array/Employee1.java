package Array;

import java.util.Date;

//2.	WAP to print the employees from Employee[] array who has same joining date. 
//You have Employee class which has 4 attributes id, name, salary, date
//(date is another object which has 3 attributes day, month, year)
//and add employee objects to your array
public class Employee1 {
	private int id;
	private String name;
	double salary;
	Date d;

	Employee1() {
		id = 0;
		name = " ";
		salary = 0;
		d = new Date();

	}

	Employee1(int id, String name, double salary, Date d) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.d = d;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", d=" + d + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 arrEmp[] = new Employee1[5];
		arrEmp[0] = new Employee1(101, "Ishwar", 20000, new Date(10, 12, 2023));
	}

}

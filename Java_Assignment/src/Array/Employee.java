package Array;

import java.util.Scanner;

//1.	WAP to print the employees from Employee[] array who has same salary 
//(Create Employee class which has 3 attributes id, name, salary and add
//employee objects to your array)//Accept id from user and 
//show all emp who get same sal has given id
public class Employee {
	int id;
	String name;
	double sal;

	Employee() {
		id = 0;
		name = " ";
		sal = 0;
	}

	Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id ");
		int id = sc.nextInt();
		Employee[] emp = new Employee[5];
		emp[0] = new Employee(1, "Ishwar", 25000);
		emp[1] = new Employee(2, "Rohit", 457845);
		emp[2] = new Employee(3, "Prashant", 25000);
		emp[3] = new Employee(4, "Vishwa", 54658);
		emp[4] = new Employee(5, "Ram", 25000);
//		for (Employee i : emp)
//			System.out.println(i);
		double sal = 0;
		for (int i = 0; i < emp.length; i++) {
			if (id == emp[i].id) {
				sal = emp[i].getSal();
				// System.out.println(emp[i]);
			}

		}
		for (int i = 0; i < emp.length; i++) {
			if (sal == emp[i].getSal()) {
				System.out.println(emp[i]);
			}
		}

	}

}

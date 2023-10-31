package com.oop;
/*add method displayData inside Student class change
values of id name in that method & also print the changed
values in same method. Call displayData method from
main method and see the output. Observe displayData can
only be called by creating object of Student
*/
public class Student {
	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int i) {
		id = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}
	public void display()
	{
		System.out.println("student id"+id+""+getId()+"");
		System.out.println("student name"+name);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.setId(67);
		obj.setName("uvjjhj");
		obj.display();
		
		obj.setId(87);
		obj.setName("hcgchgfxgf");
		obj.display();
		
		
	}

}

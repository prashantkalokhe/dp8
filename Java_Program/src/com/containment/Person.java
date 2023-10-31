package com.containment;

public class Person {

	String name;
	int age;
	String gender;
	Address add1;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String gender, Address add1) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.add1 = add1;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ",\nadd1=" + add1 + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAdd1() {
		return add1;
	}

	public void setAdd1(Address add1) {
		this.add1 = add1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person per=new Person();
		
		Address add1=new Address("panoli","MH","India");
		Person per1=new Person("prash",21,"M",add1);
		System.out.println(per1);
	}

}

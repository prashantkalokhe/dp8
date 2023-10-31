package com.containment;

public class Department {
	int id;
	String name;

	Department() {

	}

	Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "\nDept id: " + id + "  Dept name: " + name;
	}

	public static void main(String[] args) {

		Department dp = new Department(202, "Mech");
		System.out.println(dp);

	}

}

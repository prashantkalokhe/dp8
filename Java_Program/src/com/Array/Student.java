package com.Array;

class Student {
    int roll;
    String name;
    int age;
    int marks;
    StudentArray StudentArray;

    public Student(int roll, String name, int age, int marks) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Roll: " + roll + ", Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }


@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", marks=" + marks + ", StudentArray="
				+ StudentArray + "]";
	}


public class StudentArray {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = {
            new Student(1, "Alice", 14, 75),
            new Student(2, "Bob", 16, 58),
            new Student(3, "Charlie", 13, 80),
            new Student(4, "David", 15, 65),
            new Student(5, "Eve", 14, 70)
        };

        // Iterate through the array and print students who meet the criteria
        for (Student student : students) {
            if (student.marks > 60 && student.age < 15) {
                student.displayInfo();
                
            }
        }
    }
}
}

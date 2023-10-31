package com.Array;
import java.util.*;
public class StudentArray {
	
	    public static void main(String[] args) {
	        // Create an array of students using Student objects
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



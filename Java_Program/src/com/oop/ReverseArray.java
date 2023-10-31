package com.oop;

public class ReverseArray {
	public void arrayCreation() {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		this.showArrayElement(arr);
	}

	public void showArrayElement(int[] obj) {
		// TODO Auto-generated method stub
        System.out.println("Original array: ");  

		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
        System.out.println("Array in reverse order: ");  

		for (int i = obj.length - 1; i >= 0; i--) {
			System.out.println(obj[i]);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseArray obj = new ReverseArray();
		obj.arrayCreation();
	}

}

package Array;

import java.util.Scanner;

public class SumofElement {
	public static void showElement(int num[]) {
		System.out.println("Array element are------");

		for (int e : num)
			System.out.println(e + " ");

	}

	public static int[] createArray() {
		int num[];
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num = new int[size];
		for (int i = 0; i < num.length; i++) {

			System.out.println("please enter the elements ");
			num[i] = sc.nextInt();

		}

		sc.close();
		return num;
	}
	public static void Sum(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)

				sum = sum + a[i];
		}
		
	

		
		System.out.println("sum of array " + sum);
	}
	public static void main(String[] args) {
		int n[]=createArray();
		showElement(n);
		Sum(n);
	}
}
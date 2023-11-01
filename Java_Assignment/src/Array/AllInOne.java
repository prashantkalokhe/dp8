package Array;

import java.util.Scanner;

public class AllInOne {
	public static void showElement(int num[]) {
		System.out.println("Array Elements are...");
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
			System.out.println("Please Enter the element");
			num[i] = sc.nextInt();
		}
		sc.close();
		return num;
	}

	public static int sumOfArray(int num[]) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}

		return sum;
	}

	public static void reverseArray(int num[]) {
		System.out.println("Array is in reverse form is");
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
	}

	public static void evenNoOfArray(int num[]) {
		System.out.println("Even No's of array is ");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0)
				System.out.println(num[i]);
		}
	}

	public static void oddNoOfArray(int num[]) {
		System.out.println("odd no's of array is");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0)
				System.out.println(num[i]);
		}

	}

	public static int avgOfArray(int num[]) {
		int avg = 0;
		int sum = 0;
		// System.out.println("Avg of the Array is ...");
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
			avg = sum / num.length;
		}
		return avg;
	}

	public static void divideTwoAndThree(int num[]) {
		System.out.println("No's divisible by 2 and 3 ");
		for (int i = 0; i < num.length; i++) {
			if ((num[i] % 2 == 0) && (num[i] % 3 == 0))
				System.out.println(num[i]);
		}
	}

	public static void noLessThanAvg(int num[]) {
		System.out.println("Less than avg no's are");
		for (int i = 0; i < num.length; i++) {
			if (avgOfArray(num) > num[i])
				System.out.println(num[i]);
		}
	}

	public static void findMaxandMin(int num[]) {
		int max = 0, min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			} else if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("max is " + max);
		System.out.println("min is " + min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int arr[] = { 4, 5, 6, 7, 8, 9 };
		// showElement(arr);
		int n[] = createArray();
		showElement(n);
		System.out.println("Sum of array is " + sumOfArray(n));
		System.out.println("_________________________________________");
		reverseArray(n);
		System.out.println("____________________________________________");
		evenNoOfArray(n);
		System.out.println("_____________________________________________");
		oddNoOfArray(n);
		System.out.println(avgOfArray(n));
		divideTwoAndThree(n);
		System.out.println("______________________________________________");
		noLessThanAvg(n);
		System.out.println("____________________________________");
		findMaxandMin(n);
	}

}

package Array;

import java.util.Scanner;

//passing array to method and create array by using userdefined values and how to return array from method
public class MarksAndPercentage {
	public static int[] createArray() {
		int num[];
		System.out.println("Enter the number of subject");

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		num = new int[size];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter the marks of the sub");

			num[i] = sc.nextInt();

		}
		sc.close();
		return num;
	}

	public static void showElement(int num[]) {
		System.out.println("Array Elements are...");
		for (int e : num)
			System.out.println(e + " ");
	}

	public static int findTotal(int num[]) {
		int total = 0;
		// System.out.println("Total Marks are ");
		for (int i = 0; i < num.length; i++) {
			total = total + num[i];
		}
		// System.out.println(total);
		return total;
	}

	public static double percentage(int num[]) {
		double percentage = findTotal(num) / num.length;
		return percentage;
	}

	public static void grade(int num[]) {
		if (percentage(num) <= 100 && percentage(num) >= 80)
			System.out.println("Grade is A");
		else if (percentage(num) < 80 && percentage(num) >= 60)
			System.out.println("Grade is B");
		else if (percentage(num) < 60 && percentage(num) >= 35)
			System.out.println("Grade is c");
		else
			System.out.println("Grade =Fail");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = createArray();
		showElement(a);
		System.out.println(findTotal(a));
		System.out.println(percentage(a));
		grade(a);

	}

}

package Array;

import java.util.Scanner;

public class Prime {
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

			System.out.println("please enter " + (i + 1) + "the elements ");
			num[i] = sc.nextInt();

		}

		sc.close();
		return num;
	}

	public static void prime(int num[]) {
		boolean status = true;
		System.out.println("the prime number are:");
		{
			
			int i = 0;

			if ((num[i] == 0 || (num[i] == 1))) {
				System.out.println("0 and 1 are not prime");
				
			} else {
				for (int j = 2; j < num[i]; j++) {
					if (num[i] % j == 0) {
						status = false;
					} else
						status = true;
				}
			}
			if (status)
				System.out.println(num[i]);

		}
	}

	public static void main(String[] args) {
		int n[] = createArray();
		showElement(n);
		prime(n);
	}
}
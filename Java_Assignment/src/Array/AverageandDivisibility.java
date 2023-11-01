package Array;

import java.util.Scanner;

public class AverageandDivisibility {
	//sum,even ,odd,
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

	public static void Sum(int num[]) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];

		}
		System.out.println("sum of array " + sum);
	}

	public static void even(int num[]) {
		int even=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0)
				System.out.println(num[i]);
		}	
		System.out.println("even of array " + even);

		}
		public static void odd(int num[]) {
			int odd=0;
			for(int i=0;i<num.length;i++) {
				if(num[i]%2==1)
					System.out.println(num[i]);
			}
			System.out.println("odd of array " + odd);

	}
		public static void div(int num[]) {
			int div=0;
			for(int i=0;i<num.length;i++)
			{
				if(num [i]%2 == 0)
					System.out.println(num[i]);
			}
			System.out.println("divided by 2 of array " + div);

	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int arr[]= {1,2,3,4,5,6,7};
		// showElement(arr);
		int n[] = createArray();
		showElement(n);
		Sum(n);
		even(n);
		odd(n);
		div(n);
	}

}

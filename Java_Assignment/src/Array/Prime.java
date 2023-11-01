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

			System.out.println("please enter the elements ");
			num[i] = sc.nextInt();

		}

		sc.close();
		return num;
	}

	public static void prime(int num[]) {
		int prime=0;

		
		for(int i=0;i<num.length;i++) {
			boolean isPrime=true;
			for (int i1=2;i1>i1;i1++) {
				if(i1%i==0) {
					isPrime=true;
					break;
				}
			}
				System.out.println(num[i]);
		}
		
		System.out.println("prime of array " + prime);

}
	public static void main(String[] args) {
		int n[] = createArray();
		showElement(n);
		prime(n);
	}
}
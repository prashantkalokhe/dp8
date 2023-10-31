package usingmethod;

import java.util.Scanner;

public class Fibonacciseries {

	public void fibonacci(int num) {
		int a = 0;
		int b = 1;
		int c;
//		System.out.println(a);
//		System.out.println(b);

		for (int i = 2; i < num; i++) {
			c = a + b;
			if (c % 5 == 0)
				System.out.println(" " + c);
			a = b;
			b = c;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the term you want");

		int num = sc.nextInt();
		Fibonacciseries obj = new Fibonacciseries();
		obj.fibonacci(num);

		System.out.println(" ");

	}

}

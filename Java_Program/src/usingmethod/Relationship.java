package usingmethod;

import java.util.Scanner;

//write method to satisfy the relationship between the input and outputs 832output594;51out36;7977out180;665out95;149out 0
public class Relationship {
	public void reverse(int num) {
		int rev = 0;
		int temp = num;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		int result = temp - rev;
		if (result < 0) {
			System.out.println("0");
		} else {
			System.out.println(result);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Relationship obj = new Relationship();
		obj.reverse(num);
		System.out.println(" ");

	}

}

package usingmethod;

//1 22 333 4444 55555 666666 
import java.util.Scanner;

public class Series3 {
	public void series(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.print(" ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Series3 obj = new Series3();
		obj.series(num);
		System.out.println(" ");

	}
}

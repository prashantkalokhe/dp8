package usingmethod;

import java.util.*;

public class HarshadNumber {

	public boolean sum(int num) {
		int temp = num;
		int sum = 0;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		if (temp % sum == 0)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		HarshadNumber obj = new HarshadNumber();
		boolean res=obj.sum(num);
		if(res==true)
		{
			System.out.println(" number is HarshadNumber");
		}else
		{
			System.out.println("number is not HarshadNumber");
		}

	}

}

package com.whileloop;

import java.util.Scanner;

public class Armstrongwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num=sc.nextInt();

		int sum=0;
		int result=0;
		int temp=num;
		while(num!=0)
		{
			int rem=num%10;
			result=rem*rem*rem;
			sum=sum+result;
			num=num/10;
	}
		System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("It is armstrong number");
		}
		else {
			System.out.println("It is not armstrong number");
		}

}
}

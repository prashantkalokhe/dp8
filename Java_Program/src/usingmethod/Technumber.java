package usingmethod;

import java.util.Scanner;


public class Technumber {
	public void check(int num)
	{
		int org_num=num;
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		int power=1;
				for (int i=1;i<=count/2;i++)
				{
					power=power*10;
				}
				if(count%2==0)
				{
					int num1=org_num/power;
					int num2=org_num%power;
					int sum1=num1+num2;
					int square=sum1*num2;
					
				}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Technumber obj = new Technumber();
		//int rem = obj.sum(num);

	}

}

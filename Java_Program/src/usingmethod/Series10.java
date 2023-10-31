package usingmethod;

import java.util.Scanner;

public class Series10 {
	public void check(int num)
	{char ch='A';
		for(char i=1;i<=num;i++)
			
		{
			
			for (char j=1;j<=i;j++)
			{
				if(j<=i)
					System.out.print(" "+ ch);
				else
					System.out.print(" ");
			}
			ch++;
			System.out.println(" ");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number thet term series you want");
		int num = sc.nextInt();
		Series10 obj = new Series10();
		obj.check(num);

	}

}

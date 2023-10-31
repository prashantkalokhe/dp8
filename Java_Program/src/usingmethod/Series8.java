package usingmethod;

import java.util.Scanner;

public class Series8 {
	public void checknumber(int num)
	{
	int lastdigit=num%10;
	int count=0;{
	while(num>0) {
		int digit=num%10;
	
		if(digit>lastdigit)
		count++;
		lastdigit=digit;
		
	}
	
	if(count==0)

	System.out.println("It  is in incresing order");
	else
		System.out.println("It  is not in incresing order");

}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number thet term series you want");
//		int num = sc.nextInt();
		Series8 obj = new Series8();
		obj.checknumber(1245546);

	}

}

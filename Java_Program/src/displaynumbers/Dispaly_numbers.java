package displaynumbers;
import java.util.Scanner;

public class Dispaly_numbers {
	public static void main(String[] args)
	
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("number is positive");			
		}
		else
		{
			System.out.println("number is not positive");
		}
		
	}

}

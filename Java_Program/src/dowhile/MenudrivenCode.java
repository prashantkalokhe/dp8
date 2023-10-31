package dowhile;

import java.util.Scanner;

public class MenudrivenCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1");
		int num1=sc.nextInt();
		System.out.println("Enter the number2");
		int num2=sc.nextInt();
		char ch;
		do {
		System.out.println("1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Division\n");
		System.out.println("Enter the choice form Menu");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1: System.out.println("Addition= "+(num1+num2));
		break;
		case 2: System.out.println("Substraction="+(num1-num2));
		break;
		case 3: System.out.println("Multiplication= "+(num1*num2));
		break;
		case 4: System.out.println("Division="+(num1/num2));
		break;
		default:
			System.out.println("invalid choice");
		}
		    System.out.println("do you want to continue");
			ch =sc.next().charAt(0);
		}		
		
	while(ch == 'y'||ch== 'Y');
}
}


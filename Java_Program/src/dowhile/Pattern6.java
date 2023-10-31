package dowhile;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				int i,j,row;
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter the number of rows you want:");
				row =sc.nextInt();
				for(i=1;i<=row;i++)
				{
					
					for(j=1;j<=i;j++)
					{
						System.out.print(i+"");
						
					}
					System.out.println();
				}
						

			}

		

	}



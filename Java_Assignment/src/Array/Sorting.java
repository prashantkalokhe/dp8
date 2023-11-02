package Array;

import java.util.Arrays;

public class Sorting {
	

		public static void show(int num[])
		{
			System.out.print("The Array elements are : ");
			for(int ss: num)
			{
				System.out.print(ss+" ");
			}
		}
		
		public static void sorting(int num[])     
		{
			//Sorting and Swapping...
			int temp=0;
			for (int i=0; i<num.length;i++)
			{
				for(int j=0; j<num.length-1-i;j++)
				{
					if(num[j]>num[j+1])
					{
						temp=num[j];
						num[j]=num[j+1];
						num[j+1]=temp;
					}
				}
			}
			System.out.println("\nSorting is : "+Arrays.toString(num));	
		}
		
		
		public static void main(String[] args) {
		
			int arr[]= {2,4,1,3};
			show(arr);
			sorting(arr);

		}

	}

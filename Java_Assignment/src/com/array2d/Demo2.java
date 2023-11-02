package com.array2d;

public class Demo2 {
	public  void createArray() {
		{
			int arr[][]= {{10,20,30},{40,50},{60},{70,80,90,100}};
			
			for(int i=0; i<arr.length; i++)
			{
				for(int j=0; j<arr[i].length; j++)
					System.out.print(arr[i][j]+"\t");
			}
				System.out.println();
				
			}
			
			
		}	
	
public static void main(String[] args) {
	Demo2 obj = new Demo2();
	obj.createArray();
}
}

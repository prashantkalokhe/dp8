package com.oop;

public class ArrayDemo {
	
	public void arrayCreation() {
		int arr[] = new int[7];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		this.showArrayElement(arr);

		int arr1[]= {10,20,30,40,50,60,70};
		this.showArrayElement( arr);
		this.showArrayElement( arr1);

	}
		public void showArrayElement(int[] a)
		{
			for (int i=0;i<a.length;i++)
				System.out.println(a[i]);
					System.out.println("***************");
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDemo a = new ArrayDemo();
		a.arrayCreation();
		
	}

}








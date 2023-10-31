package com.oop;

public class Enhancedforloop {
	
	int arr[];

	Enhancedforloop() {
		arr = new int[5];
		for (int i = 0; i < arr.length; i++)
			arr[i] = i;

	}

	Enhancedforloop(int a[]) {
		arr = a;
	}

	public int addArrayElements() {
		int sum = 0;
		for (int i : arr)
			sum = sum + i;
		return sum;
	}

	public int[] reverseArray()
	{
		int newArr[]=new int[arr.length];
		int j=arr.length-1;
		for(int i=0;i<newArr.length;i++)
		{
			newArr[i]=arr[j];
			j--;
		}
		return newArr;
			
			}

	public void printElement() {
			for(int i :arr)
				System.out.println(i);
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enhancedforloop obj = new Enhancedforloop();
		System.out.println(obj.addArrayElements());

		int objArr[] = { 2, 3, 4, 5 };

		Enhancedforloop obj1 = new Enhancedforloop(objArr);
		System.out.println(obj1.addArrayElements());

		int resArr[] = obj1.reverseArray();
		for (int i : resArr)
			System.out.println(i);
	}

}

package Array;
import java.util.Scanner;
public class Array1 {
	public static void showElement(int num[])
	{
		System.out.println("Array element are------");
		
	for (int e:num)
		System.out.println(e+" ");
	}
	public static int [] createArray(){
		int num[];
		System.out.println("Enter the size of array=>");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		num=new int[size];
		//2
		for (int i=0;i<num.length;i++)
		{
			System.out.println("please enter the elements ");
			num [i]=sc.nextInt();
		}
		sc.close();
		return num;
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,7,8,9,4};
		showElement(arr);
		int n[]=createArray();
		showElement(n);
	}

}

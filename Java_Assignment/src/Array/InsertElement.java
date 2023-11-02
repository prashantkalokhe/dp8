package Array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {

	{
		int[] oriarr = { 2, 3, 4, 5, 6, 7, 8 };
		int Insertindex = 2;
		int Insertvalue = 30;
		oriarr[Insertindex - 1] = Insertvalue;
		System.out.println(Arrays.toString(oriarr));

	}

	public static void main(String[] args) {
		int[] oriarr = { 2, 3, 4, 5, 6, 7, 8 };
		int Insertindex = 2;
		int Insertvalue = 30;

		int newarrlength = oriarr.length + 1;
		int[] newarr = new int[newarrlength];

		for (int i = 0; i < Insertindex; i++) {
			newarr[i] = oriarr[i];
		}
		newarr[Insertindex] = Insertvalue;
		for (int i = Insertindex; i < oriarr.length; i++) {
			newarr[i + 1] = oriarr[i];
			System.out.println(oriarr);
			System.out.println(newarr);
		}
		
		
		
	}
}

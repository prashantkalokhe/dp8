package Array;

import java.util.Arrays;

public class PrintAllUniqueElementsInArray {

	    public static void printAllUniqueElements_Sorting(int [] arrA){
	        Arrays.sort(arrA);
	        int current = arrA[0];
	        System.out.print("Distinct Or Unique elements are (Sorting Method): " + current + " ");
	        for (int i = 1; i <arrA.length ; i++) {
	            if(current!=arrA[i]){
	                System.out.print(arrA[i] + " ");
	                current = arrA[i];
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int [] arrA = {1, 6, 4, 3, 2, 2, 3, 8, 1};
	        printAllUniqueElements_Sorting(arrA);
	        System.out.println();
	       // printAllUniqueElements_HashSet(arrA);
	    }
	}


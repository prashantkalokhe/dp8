package Array;


	public class ReverseArrayInPlace {
	    public static void main(String[] args) {
	        int[] arr = {3, 90, 45, 29, 37, 78};
	        
	        // Reverse the array in place
	        reverseArray(arr);
	        
	        // Print the reversed array
	        for (int element : arr) {
	            System.out.print(element + " ");
	        }
	    }

	    public static void reverseArray(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;

	        while (start < end) {
	            // Swap the elements at start and end positions
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;

	            // Move the pointers towards the center
	            start++;
	            end--;
	        }
	    }
	}



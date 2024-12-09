package aman;
import java.util.Arrays;

public class RemoveDuplicates_Array {
	public static void main(String[] args) {
		 int[] arr = {1, 2, 2, 3, 4, 4, 5};
	        
	        // First, sort the array to group duplicates together
	        Arrays.sort(arr);
	        
	        // Find the length of the new array without duplicates
	        int n = arr.length;
	        int[] temp = new int[n];
	        int j = 0;
	        
	        for (int i = 0; i < n - 1; i++) {
	            if (arr[i] != arr[i + 1]) {
	                temp[j++] = arr[i];
	            }
	        }
	        temp[j++] = arr[n - 1]; // Add the last element
	        
	        // Create a new array with the size of j (the number of unique elements)
	        int[] result = Arrays.copyOf(temp, j);
	        
	        // Print the result
	        System.out.println(Arrays.toString(result));

	}
}
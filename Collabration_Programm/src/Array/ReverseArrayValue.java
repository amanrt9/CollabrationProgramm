//1. Write a Java program to reverse an array values.
//int arr[] = {1,2,3,44,66,33};

package Array;


public class ReverseArrayValue {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,44,66,33};
		
		int len=arr.length-1;
		for(int i=len;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}

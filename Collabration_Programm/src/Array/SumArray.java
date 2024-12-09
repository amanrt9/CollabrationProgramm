//6.Write a Java program to sum values of an array.
//int arr[] = {1,2,4,5,6,7}; 

package Array;


public class SumArray {

	public static void main(String[] args) {

		int arr[] = {1,2,4,5,6,7}; 
		int sum=0;
		
		for(int add:arr) {
			sum=sum+add;
		}
		System.out.println("Sum of Array: "+sum);
	}
}

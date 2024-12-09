//11.Write a Java program to find the second largest element in an array.
//Input - 1,2,43,5,66,73;
//Output - 43 package Array;
package Array;


public class SecondLargestElementArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,43,5,66,73};
		int largest=0;
		int secondLargest=0;
			
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
		}
		System.out.println(secondLargest);
	}

}

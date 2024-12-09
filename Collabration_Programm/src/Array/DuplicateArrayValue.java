//2. Write a Java program to find duplicate values in an array.
//int arr[] = {1,2,4,5,6,3,66,33,22,1,4};

package Array;


public class DuplicateArrayValue {

	public static void main(String[] args) {

		int arr[] = {1,2,4,5,6,3,66,33,22,1,4};

		int len=arr.length-1;

		System.out.println("Duplicate values in the array: ");
		for(int i=0;i<=len;i++) {
			for(int j=i+1;j<=len;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}		
	}
}

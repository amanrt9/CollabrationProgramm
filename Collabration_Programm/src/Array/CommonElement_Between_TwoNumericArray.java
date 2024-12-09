//9.Write a Java program to find common elements between two integer arrays.
//int arr[] = {1,2,4,5,6,7};
//int arr1[] = {1,2,43,5,66,73}; 

package Array;


public class CommonElement_Between_TwoNumericArray {

	public static void main(String[] args) {
		int arr1[] = {1,2,4,5,6,7};
		int arr2[] = {1,2,43,5,66,73};
		
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr2.length-1;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}

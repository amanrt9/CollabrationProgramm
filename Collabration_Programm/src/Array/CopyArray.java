//4. Write a Java program to copy an array by iterating the array.
// int arr[] = {1,2,3,44,66,33}; 

package Array;


public class CopyArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,44,66,33}; 
		int copyArr[]=new int[arr.length];
		int newCopyArr[]=new int[arr.length];
		
		
		//reverse it and copy in another array
		for(int i=arr.length-1;i>=0;i--) {  
			newCopyArr[i]=arr[i];
			System.out.print(newCopyArr[i]+" ");
		}
		
		System.out.println();
		
		//just copy the same given array in another array
		for(int i=0;i<=arr.length-1;i++) { 
			copyArr[i]=arr[i];
		}
		for(int sort: copyArr) {
			System.out.print(sort+" ");
		}

	}

}

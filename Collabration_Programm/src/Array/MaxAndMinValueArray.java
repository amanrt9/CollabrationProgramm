//3. Write a Java program to find the maximum and minimum value of an array.
//int arr[] = {1,2,4,5,6,3,66,33,22,1,4}; 
package Array;


public class MaxAndMinValueArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,5,6,3,66,33,22,1,4}; 
		
		int max=arr[0];
		int min=arr[0];
		
		int len=arr.length-1;
		
		for(int i=0;i<=len;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Max value: "+max);
		System.out.println("Min value: "+min);
	}

}

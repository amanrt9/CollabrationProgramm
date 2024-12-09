//10.Write a Java program to remove duplicate elements from an array.
//Input ar
//Intput arr1[] = {1,2,43,5,66,73,43,5,1};
//Output - 1,2,43,5,66,73,43 

package Array;


import java.util.Arrays;

public class RemoveArrayDuplicateValue {

	public static void main(String[] args) {
		int arr[] = {1,2,43,5,66,73,43,5,1};
		Arrays.sort(arr); //{1,1,2,5,5,43,43,66,73}
		int len=arr.length;
		
		int temp[] = new int[len];
		int j=0;
		
		for(int i=0;i<len-1;i++) {  
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i]; 
			//temp[0++]=1
			//temp[1++]=2
			//temp[2++]=5
			//temp[3++]=43
			//temp[4++]=66
			
			}
		}
		
		temp[j++]=arr[len-1];//arr[len-1]=73
		//temp[5++]=73
		//int result[]=Arrays.copyOf(temp, j);
		System.out.println(Arrays.toString(temp));
	}
}

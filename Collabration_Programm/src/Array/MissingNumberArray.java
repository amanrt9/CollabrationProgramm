//12.Write a Java program to find a missing number in an array.
//Input ={1,2,3,4,5,7,8};

package Array;


public class MissingNumberArray {

	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5,7,8};
		int diff=1;
		for(int i=0;i<arr.length;i++) { //0-->1-->2-->3-->4
			if(arr[i+1]-arr[i]!=diff) {
				System.out.println((i+2)*diff);
				break;
			}
		}
	}
}

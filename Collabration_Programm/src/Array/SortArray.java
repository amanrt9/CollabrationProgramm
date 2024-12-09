//7.Write a Java program to sort a numeric array and a string array.
//int arr[] = {1,2,4,5,6,7};

package Array;


public class SortArray {

	public static void main(String[] args) {

		int arr[] = {7,4,5,3,1,2,6};

		System.out.println("----Numeric Array sort----");
		for(int i=0;i<=arr.length-1;i++) { //for 0th index
			for(int j=i+1;j<=arr.length-1;j++) { //(0th+1)=1
				if(arr[i]>arr[j]) { 
					int temp=arr[i];
					arr[i]=arr[j]; 
					arr[j]=temp; 
				}
			}
		}
		for(int sort:arr) {
			System.out.print(sort+" ");
		}
		
		System.out.println();

		System.out.println("----String Array sort----");
		String str[] = {"Mango","Apple","Orange","Banana","Guava","Grape"};

		for(int i=0;i<=str.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				if(str[i].compareToIgnoreCase(str[j])>0) {
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;					
				}
			}
		}
		for(String sort:str) {
			System.out.print(sort+" ");
		}

	}

}

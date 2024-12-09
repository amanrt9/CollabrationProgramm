//8.Write a Java program to find common elements between two arrays (string values).
//String arr[] = {“Test”,”HI”,”Java”,”Python”};
//String arr2[] = {"Hello","Java","Python", "Demo"}; 
package Array;


public class CommonElement_Between_TwoStringArray {

	public static void main(String[] args) {
		String arr1[] = {"Test","HI","Java","Python"};
		String arr2[] = {"Hello","Java","Python", "Demo"};
		
		for(int i=0;i<=arr1.length-1;i++) {			
			for(int j=0;j<=arr2.length-1;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

}

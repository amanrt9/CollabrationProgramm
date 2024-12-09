//10.Write a Java program to remove duplicate elements from an array.
//Input ar
//Intput arr1[] = {1,2,43,5,66,73,43,5,1};
//Output - 1,2,43,5,66,73,43 

package Array;

import java.util.HashSet;

public class aa {

	public static void main(String[] args) {
		int arr1[] = {1,2,43,5,66,73,43,5,1};
		
		HashSet<Integer> h=new HashSet<Integer>();
		
		for(int x: arr1) {
			h.add(x);
		}
		System.out.println(h);
		
	}

}

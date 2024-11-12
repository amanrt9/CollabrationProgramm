package chetan;

import java.util.ArrayList;
import java.util.TreeSet;

public class secondlargestinarray {

	public static void main(String[] args) {
		// JAVA PROGRAM TO FIND SECOUND LARGEST ELEMENT IN ARRAY
		
		int ar[]= {12,12,55,88,66,88,44,755,6666,87988,888,87988};
		TreeSet tr=new TreeSet();
		for(int num:ar)
		{
			tr.add(num); // got Ascending order without duplicate num 12,44,55,88,755,888,6666,87988
		}
		 ArrayList al=new ArrayList(tr); // convert into 
		
		 System.out.println("2nd largest number in Array:"+ al.get(al.size()-2));
		 
	}
//
}

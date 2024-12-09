package aman;

public class MissingNumber_ConsicativeFrom_Array {

	public static void main(String[] args) {

      int arr[]= {1,2,3,4,5,7,8,9,10};
      int diff=1;
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i+1]-arr[i]!=1) {
    		  System.out.println((i+2)*diff);
    		 break;
    	  }
      }
	}

}

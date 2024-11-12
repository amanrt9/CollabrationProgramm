package aman;

public class MissingNumberArray {

	 
		int arr[]= {1, 2, 3, 5, 6, 7, 8, 9, 10};

		public void missingNumber() 
		{
		   int	exptotal=arr.length+1;
		   
			System.out.println("Total length of array is: "+exptotal);
			
			int expected_sum=exptotal*(exptotal+1)/2;
			int number_sum=0;

			for(int i: arr)
			{
				number_sum+=i;
			}
			System.out.println("Missing number of given array is: "+expected_sum+" - "+number_sum+" = " +(expected_sum-number_sum));
		}

		public static void main(String[] args) {

			MissingNumberArray m=new MissingNumberArray();
			m.missingNumber();
		}

	}



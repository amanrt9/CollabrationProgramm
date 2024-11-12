package aman;

public class UpperAndLowerApporch2 {

	public static void main(String[] args) {

		String str="AabBCc";
		
		char [] crr=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{

			if(crr[i]>='A' && crr[i]<='Z')//upcoming char is in between A to Z if yes go to if
			{
				crr[i]= (char) (crr[i]+32);// Here Upper is going to lower by +32
			}
			
			else if(crr[i]>='a' && crr[i]<='z')//Upcoming char is in between a-z if yer go to if
			{
				crr[i]= (char) (crr[i]-32);//Here lower to upper by -32
			}

		}
		String res= new String(crr);
		System.out.println(res);

	}

}


package vivek;

public class SecondMaxArray 
{
	public static void main(String[] args)
	{
		int [] a = {5,5,3,2,5};
		int largest = 0;
		int secondl = 0;


		for(int i=0; i<a.length; i++)
		{

			if(a[i]>largest) //loop1-->1>0//loop2-->3>1//loop3-->2>3(false)goes to else if//loop4-->4>3
			{
				secondl = largest;//loop1-->secondl=0//loop2=secondl=1//loop4-->secondl=3
				largest = a[i];//loop1-->largest=1//loop2-->largest=3//loop4-->largest=4
			}

			else if(a[i]>secondl && a[i]!=largest)//this loop execute only if upper loop is failed
				{//loop3-->2>=1 && 2<3=True
					secondl = a[i];//secondl=2
				}

		}
//this else if we use for negative number

			System.out.println("Second largest Number is: " + secondl);
		
	}
}
package patterns;

public class Pattern_4_withSpace_RegularTriangle {

	public static void main(String[] args) {
		int num=5;
		for(int i=1;i<=num;i++)
		{ 
			for(int j=1;j<=num;j++)
			{
				if(j>=num+1-i)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print(" ");
					
				}
			}
			System.out.println();
		}
	}
	}



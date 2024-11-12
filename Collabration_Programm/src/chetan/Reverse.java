package chetan;

public class Reverse {

	public static void main(String[] args) {
		// //output dcba and is that Palindrome or not
		//output dcba
				String s="aba";
				String rev="";
				char[] c=s.toCharArray();
				for(int i=0; i<c.length;i++)
				{
					rev=c[i]+rev;
				}
				if(s.equals(rev))
				{
					System.out.println("Palindrom");
				}
				else {
					System.out.println("Not Pindrom");
				}

			}

		}



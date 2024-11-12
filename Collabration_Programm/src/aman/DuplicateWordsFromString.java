package aman;

public class DuplicateWordsFromString {

	public static void main(String[] args) {
		String str="Aman Chetan Vivek Aman Vivek Aman";
		String a[]=str.split(" ");
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					count++;
					a[j]="0";// to avoid the printing of duplicate
				}


			}
			if(count>1 && a[i]!=("0"))// to avoid the printing of duplicate
			{
				System.out.println(a[i]);
			}

		}


	}

}

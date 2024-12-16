package aman;

import java.util.HashMap;
import java.util.Set;

public class StringWordCounterByHashMap {

	public static void main(String[] args) {
		String s1="Ahemdabad is the Ahemdabad is the big big city";
		HashMap<String, Integer>hs=new HashMap<>();
		 String str[]=s1.split(" ");
		 
		for(int i=0;i<=str.length-1;i++)
		{
			String s=str[i];
			if(hs.containsKey(s))
			{
				hs.put(s, hs.get(s)+1);
			}
			else {                //else execute first becoz to put value in hashmap 
				hs.put(s,1);
			}
		}
		   
		Set<String> Allkeys=hs.keySet();
		for(String key:Allkeys)
		{
			System.out.println(key+":"+hs.get(key));
		}
	
		
//          for(String key:Allkeys) // to print only duplicate
//			{ 
//		        if(hs.get(key)>1)
//				System.out.println(key);
//			}
//		
		
//		for(String key:Allkeys) // to print only non-duplicate
//			{ 
//			    if(hs.get(key)==1)
//				System.out.println(key);
//			}
	

	}

}

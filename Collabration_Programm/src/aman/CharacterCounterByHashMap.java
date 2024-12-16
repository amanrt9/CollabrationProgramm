package aman;

import java.util.HashMap;
import java.util.Set;

public class CharacterCounterByHashMap {

	public static void main(String[] args) {
        
		String str="Ahemdabad";
		HashMap<Character, Integer>hs=new HashMap<>();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char c=str.charAt(i);
			if(hs.containsKey(c))
			{
				hs.put(c, hs.get(c)+1);
			}
			else {                //else execute first becoz to put value in hashmap 
				hs.put(c,1);
			}
		}
		   
		Set<Character> Allkeys=hs.keySet();
		for(Character key:Allkeys)
		{
			System.out.println(key+":"+hs.get(key));
		}
	
//		for(Character key:Allkeys) // to print only duplicate
//			{ 
//		        if(hs.get(key)>1)
//				System.out.println(key);
//			}
//		
		
//		for(Character key:Allkeys) // to print only non-duplicate
//			{ 
//			    if(hs.get(key)==1)
//				System.out.println(key);
//			}
	

		
		
		
	}

}

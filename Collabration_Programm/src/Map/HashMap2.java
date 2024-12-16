package Map;

import java.util.HashMap;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
      
		HashMap< String, Integer> hs=new HashMap<>();
		hs.put("Apple", 1);
		hs.put("Mango", 2);
		hs.put("Cheeku", 3);
		hs.put("Kiwi", 4);
	
		System.out.println(hs);
		
		System.out.println(hs.containsKey("Mango"));
		
		System.out.println(hs.containsValue(5));
		
		System.out.println(hs.get("Mango"));//to get value
		
		Set<String>Allkeys=hs.keySet();//to get All Keys
		
		for(String key:Allkeys) {
             System.out.println(key);
			
		}
		for(String key:Allkeys) {
			System.out.println(key+":"+hs.get(key));//to get Key Value Pair
		}
		
		
		
	}

}

package Map;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		//HashTable Dose not Allow Any null key And Value
		//it does not maintain insertion order
	  Hashtable ht=new Hashtable<>();
	  ht.put("Aman", 101);
	  ht.put("Pranav", 102);
	  ht.put("Nishant", 103);
	  ht.put("Shivam", 104);
	 // ht.put(null, 105);
	  //ht.put("Shashank", null);
	   System.out.println(ht);

		
		
		
	}

}

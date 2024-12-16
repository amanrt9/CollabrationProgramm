package Map;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class LinkedHasMap1 {

	public static void main(String[] args) {
		// It maintains Insertion Order
		//it allow one null key and multiple null values
		 LinkedHashMap<String, Integer> lhp=new LinkedHashMap<>();
		 
		  lhp.put("Aman", 101);
		  lhp.put("Pranav", 102);
		  lhp.put("Nishant", 103);
		  lhp.put("Shivam", 104);
		  lhp.put(null,105);
		  lhp.put("Shashank", null);
		  
		  System.out.println(lhp);

	}

}

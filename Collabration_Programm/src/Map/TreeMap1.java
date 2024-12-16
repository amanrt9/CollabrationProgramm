package Map;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args)
	{  // its does not allow null key but allow multiple null values
		// it maintain order in ascending order
       TreeMap<Integer, String> tm=new TreeMap<>();
       tm.put(78, "Ahemdabad");
       tm.put(9, "Yavatmal");
       tm.put(3, "Nagpur");
       tm.put(5, "Shegaon");
       tm.put(1, "Ayodhya");
       //tm.put(null,"Mumbai");//not allow null key
       tm.put(55, null);
       
       System.out.println(tm);
	}

}

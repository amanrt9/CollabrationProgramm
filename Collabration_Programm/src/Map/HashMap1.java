package Map;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args)
	{  ///HashMap allow one null key and multiple null values
		// it not maintain insertion order
      HashMap hp=new HashMap<>();
      hp.put(1, 'a');
      hp.put(2,'b');
      hp.put(3, 'c');
      hp.put(null, 'd');
      hp.put(4,null);
      hp.put(5, null);
      hp.put(null, null);
      hp.put(null, 'g');//it takes latest null key value override old
      
   System.out.println(hp);      
	}

}

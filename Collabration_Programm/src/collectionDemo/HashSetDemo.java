package collectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo 
{
public static void main(String[] args)
{
/*
                       Iterable()i
                             |
                  ---- collection()i-----
 *                            |
 *                          Set() I
 *                            |
 *                        HashSet() c
 *                        
 * HashSet is a class who Implements Set interface
 * HashSet is unordered and unsorted
 * Does not allow duplicate
 * it can accept only one null
 * if we have more number of operation of searching 
 * then we go for hashset as its fast in nature
 * 
 * */	
	
	HashSet set = new HashSet();
//	HashSet set1 = new HashSet();
//	HashSet<Integer> set2 = new HashSet<>();
	
	set.add("vivek");
	set.add("Aman");
	set.add('A');
	set.add(1);
	set.add(null);
	set.add(null);
	set.add(1);
	
	System.out.println(set);
	
	set.remove(1);
	System.out.println(set);
	
	System.out.println(set.size());
	
	
	
	
	boolean check = set.contains("Aman");
	System.out.println(check);
	System.out.println(set.clone());

	
	//to modify set we convert it into list 

	ArrayList a = new ArrayList(set);
	
	a.add(4, "Pune");
	System.out.println(a);
	
	System.out.println(set);
	
	a.set(4, "Nashik");
	
	//by using addAll we again add the modified data into set 
	set.addAll(a);
	System.out.println(set);
	


//	for(Object x:set)
//	{
//		System.out.println(x);
//	}
//	
//	Iterator it = set.iterator();
//	
//	while(it.hasNext())
//	{
//		System.out.println(it.next());
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

package collectionDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo 
{
public static void main(String[] args) {
	/*
	 *                   Iterable()i
                             |
                  ---- collection()i-----
 *                            |
 *                          l() I
 *                            |
 *                        LinkedHashSet() c
 *   
 * LinkedHashl is a class who Implements l interface
 * LinkedHashl is in ordered and sorted
 * LinkedHashl Does not allow duplicate
 * it can accept only one null
 * in Set we can not modify data
 * if u want to maintain the insertion order of element then we use LinkedHashl                      
 * in hashSet we can only do add, access and remove                       
	 * */
	
	
	LinkedHashSet l = new LinkedHashSet();
	
	
	l.add("vivek");
	l.add("Aman");
	l.add('A');
	l.add(1);
	l.add(null);
	l.add(null);
	l.add(1);
	
	System.out.println(l);
	
	System.out.println(l.size());
	
	
	

	
	
	
	
	
	
	
	
	
	
}
}

package collectionDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo
{
 public static void main(String[] args) {
/*                       Iterable()i
  *                            |
  *                 ---- collection()i
  *                |           |           
  *              List i      Queue i       
  *               |            |
  *               |          Dequeue i
  *               |            |
  *           LinkedList c  ----
 * 
 * different bet arrayList and linkedList
 * 1.when we have more number of retrieving operation 
 *   then at that time we preferred ArrayList
 * 
 * 2. if we have more number of insertion and deletion then we preferred LinkedList
 *    its allowed duplicate
 *    insertion order is preserved
 *    accept nulls
 *    
 *   
 * 
 * */	
	 
	 LinkedList l = new LinkedList();
	// List data = new LinkedList();
	 //LinkedList<Integer> list = new LinkedList<>();
	 
	 l.add("vivek");
	 l.add("Aman");
	 l.add('a');
	 l.add(12);
	 l.add(1.0);
	 l.add(true);
	 l.add(null);
	 
	 System.out.println(l);
	 
	 System.out.println(l.size());
	 
	 l.add(3, 'b');
	 System.out.println(l);

	 l.remove(5);
	 System.out.println(l);
	 
	 l.add(6, null);
	 System.out.println(l);
	 
	 System.out.println(l.get(1));
	 
	System.out.println(l.isEmpty());
	
	System.out.println("---------Regular for loop");
	for(int i=0; i<l.size(); i++)
	{
		System.out.println(l.get(i));
	}
    
	System.out.println("-------for each loop");
    
	for(Object x:l)
	{
		System.out.println(x);
	}
	 
	System.out.println("----------By using iterator");
	 
	Iterator it = l.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}

package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo
{
  public static void main(String[] args) 
{
 /*                       Iterable()i
  *                            |
  *                 ---- collection()i-----
  *                |           |           |
  *              List i      Queue i        Set i
  *               |            |
  *            ArrayList c     |
  *           LinkedList c  ----
  *            Vector c
  *            Stack c
  * 
  * Different methods in Collection()
  * .add();
  * .addAll();
  * .remove();
  * .removeAll();
  * .clear()
  * .isEmpty()
  * .size()
  * .retailAll()
  * .contains()
  * .containAll()
  * equals()
  *          
  *
  * List =
  *        its child of collection Interface
  *        It maintain Insertion order (indexing)
  *        it allowed null values
  *        it allowed duplicate values
  *        
  *   * in hashSet we can only do add, modify, access and remove                       
     
  * 
  * 
  * 
  * */
	  
	 ArrayList data = new ArrayList();
	 //List l = new ArrayList();
	 //List<Object> list = new ArrayList <>();
	 
	 data.add("Vivek");
	 data.add("Chetan");
	 data.add("Aman");
	 data.add('a');
	 data.add(123);
	 data.add(12.12);
	 data.add('a');
	 data.add(null);
	 
	 //System.out.println(data);
	 
	 //modify data
	 data.set(0, "vivek");
	 System.out.println(data);
	 
	 //remove data
	 data.remove(5);
	 System.out.println(data);
	 
	 
	 //add data
	 data.add(4, 'b');
	 System.out.println(data);
	 
	 //size
	 System.out.println(data.size());
	 
	 //
	 boolean status = data.contains("Chetan");
	 System.out.println(status);
	 
	 System.out.println("regular for loop");
	for(int i=0; i<data.size(); i++)
	{
		System.out.println(data.get(i));
	}
	
	System.out.println("for each loop");
	for(Object d : data)
	{
		System.out.println(d);
	}

	System.out.println("by using iterator");
	
	Iterator it = data.iterator();
	
	while(it.hasNext())
	{
	System.out.println(it.next());
	}
	   
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}

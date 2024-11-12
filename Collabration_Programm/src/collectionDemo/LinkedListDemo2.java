package collectionDemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2
{
public static void main(String[] args) 
{
  LinkedList<String> l = new LinkedList<>();
   
  l.add("A");
  l.add("B");
  l.add("F");
  l.add("D");
  l.add("E");
  l.add("C");
  
  LinkedList<String> l2 = new LinkedList<>();
  
  l2.addAll(l);
  System.out.println(l2);

//  l2.removeAll(l);
//  System.out.println(l2.isEmpty());
  
  //sort
  Collections.sort(l);
  System.out.println(l);
  
  
  Collections.sort(l, Collections.reverseOrder());
  System.out.println(l);
  
  
  LinkedList<String> list = new LinkedList<>();
   
  list.add("Dog");
  list.add("Cat");
  list.add("Horse");
  list.add("Cat");
  
  System.out.println(list);
  
  list.addFirst("Elephant");
  list.addLast("Tiger");
  System.out.println(list);
  
  list.removeFirst();
  list.removeLast();
  System.out.println(list);

  
  Collections.fill(list, "v");
  System.out.println(list);
  
  System.out.println(Collections.max(l));

  System.out.println(Collections.min(l));

  

  
  
  
  
  
  
  
  
  
  

}
}

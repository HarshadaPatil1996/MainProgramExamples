package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist {
public static void main(String[] args) {
	
	LinkedList a=new LinkedList();
	
	a.add("harshada");
	a.add(123);
	a.add("harshada");
	a.add(66.55);
	a.add('H');
	a.add(null);
	
	System.out.println(a.size());;
	System.out.println(a.contains(123));
	System.out.println(a.get(2));
	System.out.println(a.isEmpty());
	
	System.out.println(a);
	
	a.add(2, "velocity");
	System.out.println(a);
	System.out.println(a.size());
	
	a.remove(0);
	
	a.set(3, "linkedlist");
	System.out.println(a);
	
	System.out.println("print data using universal iterator-->");
	Iterator LL=a.iterator();
	while(LL.hasNext())
	System.out.println(LL.next());
	
	System.out.println("print data using list iterator-->");
	ListIterator aa=a.listIterator();
	while(aa.hasNext())
		System.out.println(aa.next());
	
	System.out.println("print data using for loop-->");
	for(int i=0;i<=a.size()-1;i++)
	System.out.println(a.get(i));
	
	System.out.println("print data using for each-->");
	for(Object d:a)
		System.out.println(d);
	
	
	
	
	
	
	
	
	
	
	
}
}

package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector {
public static void main(String[] args) {
	
	Vector V=new Vector();
	
	V.add("TINA");
	V.add(123);
	V.add("TINA");
	V.add(66.55);
	V.add('H');
	V.add(null);
	
	System.out.println("capacity of vector: "+V.capacity());
	
	System.out.println("size of vector: "+V.size());
	
	System.out.println("data present at index 4 : "+V.get(4));
	if(V.contains(13)==true)
		System.out.println("no 13 is present inthis vectorlist");
	
	else
		System.out.println("no 13 is not present in this vector");
	
	
	if(V.isEmpty()==true)
		System.out.println("this vector is empty");
	
	else
		System.out.println("this vector contains data");
	
	
	V.add(4, "velocity");
	System.out.println(V);
	
	V.set(5, "software");
	System.out.println(V);
	
	V.remove(0);
	System.out.println(V);
	System.out.println("print data using universal iterator");
	
	Iterator ar=V.iterator();
	
	while(ar.hasNext())
		System.out.println(ar.next());

	System.out.println("print data using list iterator");
	ListIterator ab=V.listIterator();
	while(ab.hasNext())
	System.out.println(ab.next());
	
	System.out.println("print data using for loop");
	
	for(int i=0;i<=V.size()-1;i++)
		System.out.println(V.get(i));
	
	System.out.println("print data using for each loop");
	
	for(Object s1: V)
		System.out.println(s1);
	
	System.out.println("print data using enumeration-->");
	
	Enumeration abc=V.elements();
	while(abc.hasMoreElements())
		System.out.println(abc.nextElement());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

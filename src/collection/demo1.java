package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class demo1
{
public static void main(String[] args) {
	
	ArrayList a= new ArrayList();
	
	a.add(123);
	a.add("nikku");
	a.add('b');
	a.add(null);
	a.add("home");
	a.add(555);

	System.out.println(a.get(1));
	System.out.println(a.contains(null));
	System.out.println(a.size());
	
	a.add(3,"kalu");
	System.out.println(a);
	System.out.println(a.size());
	a.remove(5);
	a.set(4, "hhh");
	System.out.println(a);
	System.out.println(a.size());
	
	
	Iterator iit=a.iterator();
	while(iit.hasNext())
	{
		System.out.println(iit.next());
	}
	
	
	for(int i=0;i<=a.size()-1;i++)
{
		System.out.println(a.get(i));
	
	}
	
	for(Object bb : a)
	{
		System.out.println(bb);
	}
	
	
	
	
	
}
}

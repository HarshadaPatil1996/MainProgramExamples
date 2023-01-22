package SET;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashSet {
public static void main(String[] args) {
	
	LinkedHashSet a=new LinkedHashSet();
	
	a.add("tina");
	a.add("harshada");
	a.add(123);
	a.add('k');
	a.add(666);
	a.add(null);
	a.add("tina");
	a.add(null);
	
	System.out.println(a);//no duplicate values allowed
	                    //only one null value is allowed
	//order of incertion maintained
	//no default capcity
	//ds=linear+hashtable
	//best choice=use this to remove duplicate data when order of incertion is mandetory
	
	System.out.println(a.size());
	System.out.println(a.contains(123));
	System.out.println(a.isEmpty());
	a.remove(666);
	System.out.println(a);
	
	System.out.println("------Print data using iterator--------");
	
	Iterator itr=a.iterator();
	while(itr.hasNext())
	System.out.println(itr.next());
	
	System.out.println("------Print data using foreach loop--------");
	
	for(Object d:a)
		System.out.println(d);
	
	
	
	
	
}
}

package SET;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
public static void main(String[] args) {
	
 HashSet a=new HashSet();
 
 /*no duplicate values allowed
  * only one null value is allowed
  * order of incertion=random
  * Data struture and storage type = hashtable
  * best used =to remove duplicate values if order of incertion is not mandetory
  * no default capacity */
	
	a.add("tina");//no duplicate value is allowed
	a.add("tina");
	System.out.println(a);
	
	a.add(null); //only one null value is allowed
	a.add(null);
	System.out.println(a);
	
	a.add(123);
	a.add('a');
	a.add("velocity");        //randomly all the data will be stored
	a.add(66.66);
	System.out.println(a);
	
	System.out.println(a.size());
	System.out.println(a.contains(123));
	System.out.println(a.isEmpty());
	
	a.remove("tina");  //we can only remove the data
	//we can't add and modify data because index concept is not there
	System.out.println(a);
	
	System.out.println("------fetch data using iterator----");
	Iterator itr=a.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	
	System.out.println("---fetch data using for-each loop----");
	for(Object d:a)
		System.out.println(d);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

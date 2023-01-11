package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class array_list_fetch_iterator {
public static void main(String[] args) {
	
	
	ArrayList ar=new ArrayList();
	
	ar.add("tina");
	ar.add("tina");
	ar.add("nimu");
	ar.add(1235);
	ar.add(66.22);
	ar.add('a');
	ar.add(5555);
	
	System.out.println("size of list: "+ar.size());
	
	System.out.println("arraylist contains char 'a' : "+ar.contains('a'));
	
	System.out.println("data at index 4 is: "+ar.get(4));
	
	System.out.println("is this arrylist is empty : "+ar.isEmpty());
	
	ar.add(4,'b');
	System.out.println(ar);  //it will add info to that index no and alll the data will be shifted to right 
	
	ar.remove(2);// it will remove the data at given index no.
	
	System.out.println(ar);
	
	ar.set(0, "harshada");  //to update/modify the data present at perticular index
	System.out.println(ar);
	
	//iterator is used to fetch the data from arraylist and all 7 implements classes (universal iterator)
//	System.out.println("print data using iterator:--->");
//	Iterator get=ar.iterator();
//	
//	while(get.hasNext())
//	{
//		System.out.println(get.next());
//		
//	}
//	System.out.println("print data using for loop:--->   ");
//	// to fetch data using for loop
//	
//	for(int i=0;i<=ar.size()-1;i++)
//	{
//		System.out.println(ar.get(i));
//	}
//	
//	System.out.println("print data using for-each loop:--->   ");
//	
//	for( Object sun : ar)
//	{
//		System.out.println(sun);
//	}
//	
	
	Iterator k=ar.listIterator();
			while(k.hasNext())
			{
				System.out.println(k.next());
			}
	
	
	
	
	
	
	
	
	
	
}
}

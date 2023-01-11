package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class demo2 
{
public static void main(String[] args) {
	
	ArrayList ar=new ArrayList();
	
	ar.add("harshada");
	ar.add("tina");
	
	ar.add(123);
	ar.add('n');
	ar.add(66);
	ar.add(null);
	ar.add("harry");
	
	System.out.println("arraylist size : "+ar.size());
	System.out.println(ar.contains(null));
	System.out.println(ar.get(5));
	System.out.println(ar.isEmpty());
	
	ar.add(4,"niki");
	System.out.println("arraylist size after addition of new data: "+ar.size());
	
	ar.remove(6);
	
	ar.set(2,666000);
	System.out.println("arraylist size after removal of data: "+ar.size());
	
	
	System.out.println("fetch data using iterator--->");
	
	Iterator result=ar.iterator();
	
	while(result.hasNext()) {
		System.out.println(result.next());
	}
	
	
	System.out.println("fetch data using for loop--->");
	
	for(int i=0;i<=ar.size()-1;i++)
	
	{
		System.out.println(ar.get(i));
	}
	
	
	System.out.println("fetch data using for_each loop--->");
	
	for(Object get: ar)
	{
		System.out.println(get);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}

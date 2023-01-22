package SET;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;



public class remove_duplicate_linkhashset {
public static void main(String[] args) {
	
	ArrayList a=new ArrayList();
	a.add("tina ");
	a.add(12);
	a.add(12);		
	a.add(12);
	a.add(12);
	a.add("tina ");
	a.add("tina ");
	a.add("tina ");
	a.add(null);
	a.add(null);
	a.add(null);
	a.add(123);
	a.add(666);
	
	LinkedHashSet b=new LinkedHashSet(a);
	Iterator itr=b.iterator();
			while(itr.hasNext())
	System.out.println(itr.next());
	
	//order of incertion is maintained and all duplicate data removed
	
	
	
	
	
	
	
	
	
}
}

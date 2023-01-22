package SET;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import collection.arrylist;

public class remove_duplicate_usehashset {
public static void main(String[] args) {
	
	ArrayList ab=new ArrayList();
	
	ab.add("tina ");
	ab.add(12);
	ab.add(12);		
	ab.add(12);
	ab.add(12);
	ab.add("tina ");
	ab.add("tina ");
	ab.add("tina ");
	ab.add(null);
	ab.add(null);
	ab.add(null);
	
	HashSet a=new HashSet(ab);
	Iterator itr=a.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	
	
	
	
}
}

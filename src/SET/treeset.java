package SET;

import java.util.TreeSet;

public class treeset {
public static void main(String[] args) {
	
	//data stored in ascending order
	//if we store int vales=ascending
	//if we store string values=alphabetical odrder
	//only one type of data is stored=homogenious data 
	//duplicte values not allowed and null values are NOT allowed
	//ds=balanced tree
	//best choice=to remove duplicate data when order of incertion is ascending
	TreeSet a=new TreeSet();
	
	a.add(1);
	a.add(2);a.add(2);a.add(3);a.add(4);a.add(5);a.add(6);
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.contains(2));
	System.out.println(a.isEmpty());
	a.remove(4);
	
	System.out.println(a);
	
	System.out.println(a.first());           //to get data of 1st position
	
	System.out.println(a.last());              //to get data of last position
	
	
	a.pollFirst();      //to remove ist position data
	System.out.println(a);
	
	a.pollLast();    //to remove last position data
	System.out.println(a);
	
	
	
	
	
	
	
}
}

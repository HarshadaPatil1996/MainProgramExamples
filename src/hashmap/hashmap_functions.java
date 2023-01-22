package hashmap;

import java.util.HashMap;
import java.util.Set;

public class hashmap_functions 
{
public static void main(String[] args)
{
	HashMap<Integer, String> mp=new HashMap<Integer, String>();
	
	mp.put(101, "harshada");
	mp.put(102, "tina");
	mp.put(103, "niku");
	mp.put(104, "kalu");
	
	System.out.println(mp.containsKey(104));
	
	System.out.println(mp.get(104));
	
	Set<Integer> allkeys;
	
	allkeys=mp.keySet();
	
	for(Integer key:allkeys)
	{
		System.out.println(key+": "+mp.get(key));
	}
	
	
	//put(key,value)---> to add values and keys in hashmap
	//containskey(key)--->to verify if key is present or not
	//get(key)--->to get value of specific key
	//keyset()---> to get allkeys from hashmap
	
	
	
	
}
}

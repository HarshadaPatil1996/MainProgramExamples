package collection;

import java.util.ArrayList;

public class arrylist 
{

	public static void main(String[] args) {
		
		
		ArrayList store=new ArrayList();  //initial capacity is 10
		                                  //index 0 to 9
		
		store.add("tina");         //objectname.add()--->thid method is used to add values to collection
		store.add(20);            //values/info will be added in sequence from statrt index till end index
		store.add(66.66);
		store.add("heloo");         //we can add any datatype value in htis collection
		store.add(null);
		store.add("jjj");
		store.add(null);                    // null is used to reserve space for later use
		store.add("jkkkkkkkk");
		
		System.out.println(store.size());      //occupied idex out of capacity
		                                      //so here capacity ia 10 and ocupied spaces are 8
		//so when we call store.size method we get occupied spaces out of capacity i.e 8
		
		
		System.out.println(store);
		
		System.out.println(store.contains(20));//to verify if this collection ocntain a perticular value/info
		
		System.out.println(store.get(3));  //to get information store in that index
		
		System.out.println(store.isEmpty()); //to check if the colleciton is empty or not
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

	
	
	
	
	
	
	
	
}

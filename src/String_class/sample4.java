package String_class;

public class sample4
{
public static void main(String[] args)
{
	String d2;   //only declaration object is created
	
	d2="tina";
	
	String d1="tina"; //declaration+initializtion object is created
	

	
	d1=d1+" hello";  //different object will be created for d1 and the 'hello' will 
	                                        //be added to that new obj
	
	System.out.println(d1);
	
	
//	object creation without new keyword
	
	String h1="MINU";
	
	System.out.println("obj. will be stored in constant pool area : "+h1);
	
	
//	object creation with new keyword	
	
	String h2=new String ("tinu");
	
	System.out.println("obj. will be stored in non-constant pool area : "+h2);
	
	
//length of d1
	
	System.out.println("length of d1 is: "+d1.length());
	
	
	System.out.println("change into upper case: "+d1.toUpperCase());
	
	System.out.println("chnage h1 into lower case: "+h1.toLowerCase());
	
	System.out.println("check to see if data and case are same: "+ (h1.equals(h2)));
	
	System.out.println("check to see if only data is same: "+ (h2.equalsIgnoreCase(h1)));
	
	System.out.println("check to see if location is same:"+(d1==d2));
	
}
}

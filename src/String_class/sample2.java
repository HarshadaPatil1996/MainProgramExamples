package String_class;

public class sample2 extends sample1
{
	public static void main(String[] args)    //location of the objects in string class
	{
		
		//object creation without new keyword
		
	String s1="tina";             //for s1,s2 object will be same becuz info stored is same 
	
	String s2="tina";
	
	String s3="TINA";            //for s3 different object will be created  
	
	System.out.println("location of s1 is same as s2: "+(s1==s2));
	
	System.out.println("location of s2 is same as s3: "+(s2==s3));
	//---------------------------------------------------------
	
	//object creation with new keyword
	
	String s4=new String("harshu");              //even though the info is same in s4 and s5 objects created 
	                                              // will be differnt everytime for each info
	
	String s5=new String ("harshu");
	
	System.out.println("location of s4 is same as s5: "+(s4==s5));
	
	String s6=new String("jdvbjkafvb");
	System.out.println(s6);
}
}
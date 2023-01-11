package String_class;

public class sample3
{
public static void main(String[] args) 
{
	String s1="tina";    //declartion and initialization
	
	String s2="HARSHADA";
	
	String s3="Harshu";
	
	
	String s4="tina";
	
//	to change into upper case
	
	System.out.println(s1.toUpperCase());             //temporay change
	
	s1=s1.toUpperCase();           //permanant chnage
	
	System.out.println(s1);          
	
	// to change into lower case
	
	System.out.println("HARSHADA :-->"+s2.toLowerCase());
	
	// to find the size of the object 
	
	System.out.println(s2.length()+" charaters");
	
	
	//to chek if objects are equal 
	
	//condition 1st : data is checked and case (upper/lower) is also checked
	
	System.out.println("TINA is same as tina (consider case) : "+s1.equals(s4));
	
	
	
	
	//condition 2nd : only data is checked
	
	System.out.println("TINA is same as tina (dont consider case) : "+s1.equalsIgnoreCase(s4));
	
	System.out.println(s3.toUpperCase());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

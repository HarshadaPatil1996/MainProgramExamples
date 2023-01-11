package Method_withReturnType;

public class sample3 
{
public int addition(int a, int b)
{
	int sum =a+b;
	return sum;
}
	
public static int substraction() 
{
	int c=20,l=300;
	int sub =l-c;
	return  sub;
	

}
	public static String myname(String name) 
	{
		return name;
				
				
	}
	
	public static void main(String[] args) {
		
	System.out.println(myname("tina"));	
		
	System.out.println(substraction());	
		
	
	sample3 m=new sample3();
	
	System.out.println(m.addition(25,36));	
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}

package access_specifires;

public class private1 
{
            //scope is only within the class      
	     //private keyword is used
	private int a;
	private int b;
	
	private private1(int e,int h)
	{
		a=h;
		b=e;
	}
	
	private void m1()
	{         
		System.out.println(a+b);
	}
	
	public static void main(String[] args) 
	{
		
		
		private1 n1=new private1(25,65);
		n1.m1();
		
		private1 n2=new private1(56,58);
		System.out.println(n2.b);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

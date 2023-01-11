package variable_typse;

public class demo1 {
	
	static int a=80;                // globle static variable
	
	
	public static void main(String[] args)                  //main method 
	{
		System.out.println(a);
		
		h();                                    //regular static method call from same class
		
		
		newaa.m1();                             //regular static method call from diff class
		
		demo1 d1=new demo1();          //non-static regular static method call from same class    
		d1.mm1();
		
		static_globle b1=new static_globle();
		b1.g2();                       //non-static regular static method call from diff class      
		
	}
	
	public static void h()                       //static regular method
	{
		System.out.println(a);                
	}
	
public void mm1()                             //non-static regular method    
{
	System.out.println(a);
}

}

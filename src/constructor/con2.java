package constructor;

public class con2 {               //constructor without parameter

	
	int a;                        //global variable
	int b;
	
	con2()
	{
		a=20;                                      //constructor body
		b=30;                              //initialization
		
	}
	
	
	public void add()
	{
		System.out.println(a+b);
	}
	
	public void mul()
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
		
		
		con2 n2=new con2();
		n2.add();
		
		con2 n3=new con2();
        n3.mul();
		
		
	}
	

	
	
}

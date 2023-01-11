package variable_typse;

public class local_variable {
	
	
	int h=50;                       //non static globle variable 
	
public static void main(String[] args)

{
	
	
	int a=20;	
	System.out.println(a);                     //local variable
	
	local_variable n2=new local_variable();
	System.out.println(n2.h);                            //non static globle variable 
	
	
	m1(20);
	
}


public static void m1(int c) 
{
	
	System.out.println(c);                  //local variable
	
	local_variable n3=new local_variable();             //non static globle variable    
	
	System.out.println(n3.h);
}
public void has1()
{
	System.out.println(h);
}

}

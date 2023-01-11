package Exception_handling;

public class sample3 {
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		
		int div=0;
		
		try 
		{
			div=a/b;    // 10/0 = 
		} 
		catch (ArithmeticException e)
		{
			//System.out.println("Arithmetic Exception handled");
		}
		
		
		System.out.println(div);    //5
		
		System.out.println("GM");
				
	}

}

package Exception_handling;

public class sample6 {
	
	public static void main(String[] args) 
	{
		int [] ar=new int[4];    //0 to 3
		
		try
		{
			ar[7]=1000000000;       //risky code
		}
		catch (ArithmeticException e) 
		{
			System.out.println("arithmatic exception handled");
		}
		catch (StringIndexOutOfBoundsException a) 
		{
			System.out.println("StringIndexOutOfBounds exception handled");
		}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}
		catch (Exception e) 
		
		{
			e.printStackTrace();
			
			System.out.println("generic exception handled");
		}
		
		System.out.println("Hi");
		System.out.println("Hello");				
	}

}

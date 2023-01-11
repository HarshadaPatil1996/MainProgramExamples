package Exception_handling;

public class sample1 {
	public static void main(String[] args) 
	{
		int [] ar=new int[4];    //0 to 3
		
		
		try
		{
			ar[1]=10;       //risky code
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception handled");
		}		
		
		System.out.println("Hi");
		System.out.println("Hello");				
	}

}

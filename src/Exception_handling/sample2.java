package Exception_handling;

public class sample2 {
	public static void main(String[] args) 
	{
		String s1="abcd";     //0-3
				
		try
		{
			System.out.println(s1.charAt(6));
		}
		catch(StringIndexOutOfBoundsException a)
		{
			System.out.println("StringIndexOutOfBounds Exception handled");
		}
		
		
		System.out.println("Hi");
		System.out.println("Hello");
				
	}

}

package allprograms;

public class nested_if {
	public static void main(String[] args)
	{
		
		int PEM=400;
		
		//200>=300
		if(PEM>=300)                  //outer if
		{
			System.out.println("Eligible for mains exam");
			
			int MEM= 400;
			
			//  500>=700
			if(MEM>=700)                       //nested/inner IF
			{
				System.out.println("Got Selected");
			}
			else 
			{
				System.out.println("Rejected from main exam");
			}			
		}
		else 
		{
			System.out.println("Not Eligible for mains exam");
		}
	
	}

}

package allprograms;

public class else_if {

	public static void main(String[] args)
	{
		
		int marks=77;
			
		//30>=65
		if(marks>=65)
		{
			System.out.println("Distinction");
		}
		 //        30>=60
		else if (marks>=60 & marks<=64)            //60-64
		{
			System.out.println("1st class");
		}
		 //       30>=50  &   55<=59
		else if (marks>=50 & marks<=59)            //50-59
		{
			System.out.println("2nd class");
		}
		//       30 >=35  & 40<=49
		else if (marks>=35 & marks<=49)            //35-49
		{
			System.out.println("Pass");
		}
		//  30<35
		else if (marks<35)
		{
			System.out.println("Fail");			
		}
		
		
		
		
	}
}

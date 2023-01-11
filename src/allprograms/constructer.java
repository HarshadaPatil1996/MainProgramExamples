package allprograms;

public class constructer  {
	//example1: default constructor
	
		//default constructor  --> provided by compiler   --> same class 
		//use:  use to copy all the data into object
//		sample1()
//		{
//			
//		}
		
			
		public void m1()
		{
			System.out.println("running non-static regular method m1 from same class");
		}
		
		
		public static void main(String[] args)
		{	
			//default constructor call from same class
			constructer	s1=new constructer();
			s1.m1();
				
			//1. sample1 --> classname  --> datatype
			//2. s1 --> objectname  --> to identify/refer object
			//3. new  -- keyword  --> to create blank/empty object
			//4. sample1() --> classname() --> constructor --> use to copy all the data into object 
		
			
		
			
		}

}

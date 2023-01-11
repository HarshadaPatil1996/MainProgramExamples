package allprograms;

public class constr_with_para {
	//example 2: user defined constructor --> without or zero parameter 
	
		//step1: declaration
		int num1;        //10
		int num2;        //20
		
		//step2: initialization
		//user defined constructor  --> provided by user  --> same class
		//use1: to initialize global variable
		//use2: copy all the members of class into object
		constr_with_para()         //without or zero parameter constructor
		{
			num1=10;
			num2=20;		
		}
		
		//step3: usage
		public void addition() 
		{
			System.out.println(num1+num2);
		}
		
		public void mul() 
		{
			System.out.println(num1*num2);
		}
		
		
		public static void main(String[] args) 
		{
			constr_with_para s3=new constr_with_para();
			s3.addition();
			s3.mul();
			
			
			
		}
}

package constructor;

public class con4 {            //constructor with parameter

	
	
	int num1;                    //global variable
	int num2;
	
	con4(int k,int h)
	{
		num1=k;
		num2=h;
	}
	
	public void multi()
	{
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args)
	{
		
		con4 n1=new con4(56, 63);
		n1.multi();
	
		
	}
	
	
	
}




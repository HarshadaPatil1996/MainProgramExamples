package Method_withReturnType;

public class sample1 
{
public static void main(String[] args) {
	
	
	int num1 = add(25,36);                    //method return with parameters
	System.out.println(num1);
	
	System.out.println(add(65,600));
	
	
	
	sample1 n=new sample1();
	 
	int num2 = n.sub();                                      // method return without parameters
	System.out.println(num2);
	
	
	System.out.println(sample2.multi(25, 36));                        //from different class
}
	

public static int  add(int a,int b) 
{
	int num=a+b;
	
	return num;
}

public int sub() 
{  
	int g=20,h=25;
	
	int sum=g+h;
	 return sum;
	
}


























}

package access_specifires;

public class default1
{

	int a;
	int b;
	
	default1(int ant,int hat)
	{
		a=ant;
		b=hat;
	}
	
	 void run()
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args)
	{
		default1 n1=new default1(88,99);
		n1.run();
	}
	
	
	
}

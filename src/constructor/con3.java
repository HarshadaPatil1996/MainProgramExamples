package constructor;

public class con3 {      //constructor overloading
	
	int no1;
	int no2;
	
	float per;

	String name;
	
	con3(int a, int b)
	{
		no1=a;
		no2=b;
	}
	
	public void add()
	{
		System.out.println("addition: "+(no1+no2));
	}
	
	con3(float a)
	{
		per=a;
		
	}
	
	con3(String a)
	{
		name=a;
		
	}
	
	public void percentage()
	{
		System.out.println("percentage: "+per+"%");
	}
	
	public void student_name()
	{
		System.out.println("student name:" +name);
	}
	
	public static void main(String[] args)
	{
		
		con3 n1=new con3(54, 85);
		n1.add();
		
		con3 n2=new con3(65.56f);
		n2.percentage();
		
		con3 n3=new con3("harshada");
		n3.student_name();
		
		con3 n4=new con3(65, 85);
		n4.add();
		
		con3 m3=new con3("patil");
		m3.student_name();
	}
	
	
	
	
	
	
	
}

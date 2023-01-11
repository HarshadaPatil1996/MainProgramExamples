package variable_typse;

public class static_globle {
static int k=56;                                  //static globle

public static void main(String[] args)                    //main method
{
	System.out.println(k);

	g1();
	
	
	 static_globle h1=new  static_globle();
	 h1.g2();                                        
	
}
  public static void g1()                           //  static regular method
  {
	  System.out.println(k);                        
  }
  

public void g2()                                        //  non-static regular method

{
	System.out.println(k);
}


}

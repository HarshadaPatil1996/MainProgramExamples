package casting;       //converting one type of data into other type 

public class pre_casting       //pre-mitive casting //three types
{

	public static void main(String[] args)
	
	{
		
		/* type1: implicit casting memory increases
		 * lower data-type into higher (memory size i.e. 4 bytes -> 8 bytes)
		 */
		
		int a=10;           //4 byte
		
		long b=a;           //assign to 8 bytes
		b=1532265465l;
		System.out.println(b);       //8 byte
		
		

		/* type2:explicit casting /narrowing casting = memory goes decreasing
		 * higher data-type into lower (memory size i.e. 8 bytes -> 4 bytes)
		 */
		
		double h=25;            //8byte
		
		float s= (float)h;         //8 to 4 bytes
		     s=522246.221f;
		System.out.println(s);          // 4 bytes
		
		
		// type3:boolean casting /in-compatible  casting =value already pre-declared
		
		
		
		
		
		
	
	
	
	
	
	
	}	
	
	
	
	
}

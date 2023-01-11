package casting;

public class up_casting 

/* when a super  class takes back its properties (variables,methods) from sub class
 * inheritance is performed and extends key word is used
 */
{      public static void main(String[] args) {
	
// to perform up_casting change subclass name->superclass name    (i.e. son ->father)
        father_super n1=new son_sub();
        
        System.out.println("properties returned to super class");
        n1.car();
        
        n1.house();
        n1.land();
        
     /* properties acquired from super class will be returned only
      * i.e. sub class own properties will not go to super class
      * if properties are overriden then changed proerties will be returned to super class
      *    
      *    
      */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      //  System.out.println("properties of sub class");
      //  n1.mobile();
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
}

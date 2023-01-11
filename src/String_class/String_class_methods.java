package String_class;

public class String_class_methods
{
public static void main(String[] args)
{
	String s1="tina";
	String s2="TINA";
	String s3="my name is harshada";
	String s4="velocityiki";
	String s5="";
	
//	string methods 
//	to find lentgth of the string
 System.out.println(s1.length());	

 //to convert into upper case
 System.out.println(s1.toUpperCase());
	
//to convert into lower case	
	System.out.println(s2.toLowerCase());
	
//to check if data and case are same
	System.out.println(s1.equals(s2));
	
//to check only data is same 
	System.out.println(s1.equalsIgnoreCase(s2));
//to check a perticualer word in sttring
	System.out.println(s3.contains("name"));        //case sensitive
	
//to check if the string is empty
	System.out.println(s5.isEmpty());
	
//to check the chararcter using index no                       v e l o c i t y i k i            
	 System.out.println(s4.charAt(5));                       //0 1 2 3 4 5 6 7 8 9 10

//	to check the index no of charcharter
	 System.out.println(s4.indexOf('o'));

//	if multiple same char present find the last char index
	 System.out.println(s4.lastIndexOf('i'));
	
// to verify start of the string                        //my name is harshada
	 System.out.println(s3.startsWith("my"));
	
// to verify end of the string	
	System.out.println(s3.endsWith("harshada"));

// to replace a word in string
	System.out.println(s3.replace("harshada","tina"));

//to add functions or two stings
System.out.println(s1+s2);	             // or

System.out.println(s1.concat(s2).concat(" ").concat(s3));	
//                                                                 v e l o c i t y i k i     
//to print selected characters using index                       //0 1 2 3 4 5 6 7 8 9 10
System.out.println(s4.substring(5));           //it will print from 5 to onwards(L-->R)

System.out.println(s4.substring(4, 8));	       //to print middle or in between chars     
	
//to store multiple words in string	
	
	String h1="hi hello everyone im harshada";
	
	String [] ar=h1.split(" ");

for(int i=1;i<=4;i++)
{
	System.out.print(ar[i]+" ");
}

System.out.println();
String [] ar1=h1.split(" ");
for(int j=1;j<=4;j++)
{
System.out.print(ar1[j]);
}













}
}

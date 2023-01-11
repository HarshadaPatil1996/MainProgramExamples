package String_class;

public class sample6
{public static void main(String[] args) {
	

String a="tina";

String b="TINA";
String h="nardana"	;
String c="my name is harshada";	
	

System.out.println(a.length());
System.out.println(a.toUpperCase());
System.out.println(b.toLowerCase());
System.out.println(a.equals(b));
System.out.println(a.equalsIgnoreCase(b));
System.out.println(a.charAt(2));
System.out.println(a.indexOf('n'));
System.out.println(c.contains("name"));
System.out.println(c.startsWith("my"));
System.out.println(c.endsWith("harshada"));
System.out.println(h.lastIndexOf('a'));
System.out.println(a.isEmpty());
System.out.println(h.substring(2,5));
System.out.println(c.replace("harshada", "nikku"));
System.out.println(a+b);
System.out.println(a.concat(c));

	String []ar=c.split(" ");
	
	for(int s=0;s<=3;s++)
	{
		System.out.print(ar[s]);
	}






	
	
}	
}

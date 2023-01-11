package allprograms;

public class allmethodtogether {
	
public static void main(String[] args) {
	m1();
	
	diffclass.m3();
	
	allmethodtogether j1=new allmethodtogether();
    j1.m2();
    
	diffclass j2=new diffclass();
	j2.m4();
	
}
public static void m1() {
	System.out.println("regular static same class");
}

public void m2() {
	
	System.out.println("non static diff class");
}



}

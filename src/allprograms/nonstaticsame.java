package allprograms;

public class nonstaticsame {
public static void main(String[] args) {
	
	nonstaticsame s1=new nonstaticsame();
	
	s1.method1();
	s1.method2();
	
	nonstaticdiff s2=new nonstaticdiff();
	s2.method3();
	s2.method4();

}

public void method1() {
	
	System.out.println("run method1 from same class ");
}

public void method2() {
	
	System.out.println("run method2 from same class ");
}


}

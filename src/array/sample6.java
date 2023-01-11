package array;

public class sample6
{
public static void main(String[] args) 
{
	String [][]ar=new String[2][3];
	
	ar[0][0]="tina";
	ar[0][1]="harshu";
	ar[0][2]="nikku";
	ar[1][0]="mrudu";
	ar[1][1]="mona";
	ar[1][2]="sona";
	
	String [][] arr= {{"ac","add","ajjjd"},{"ahjbdc","djsb","dcbj"}};
	
	
	for(int i=ar.length-1; i>=0; i--)
	{
		for(int j=2;j>=0; j--)
		{
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
	
	
	   
	
	
}
}

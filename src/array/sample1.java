package array;

import java.util.Arrays;

public class sample1
{
	public static void main(String[] args)    //single diamentional
	{
		String [] names=new String[5];
		
		names[0]="tina";
		names[1]="harshu";
		names[2]="mrudu";
		names[3]="nikki";
		names[4]="guddu";
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(names[i]);
		}
		
		System.out.println(names[2]);
		
		
		
		
		for (int a=0; a<=names.length-1;a++)
		{
			System.out.println(names[a]);
		}
		
	}
	
	
	
	
	
	

}

package HomeWork;

import java.util.Arrays;

public class Cnumber 
{
	static int countofnumber = 0;
	
	public static void main(String[] args)
	{ 
		String name = "abcdefgh1234";
		char [] a1=name.toCharArray();
		System.out.println(Arrays.toString(a1));
		for(int i=0;i<a1.length;i++)
		{
			boolean ans = Character.isDigit(a1[i]);
			if(ans==true)
			{
				countofnumber++;
			}
		}
		System.out.println("Total alpha-->" + countofnumber);
		
			
		

	}

}

package HomeWork;

import java.util.Arrays;

public class Alpha 
{
	static int countofalpha = 0;
	
	public static void main(String[] args) 
	{
		String name = "abcdefgh";
		char [] a1=name.toCharArray();
		System.out.println(Arrays.toString(a1));
		for(int i=0;i<a1.length;i++)
		{
			boolean ans = Character.isAlphabetic(a1[i]);
			if(ans==true)
			{
				countofalpha++;
			}
		}
		System.out.println("Total alpha-->" + countofalpha);
		
			
	}

}

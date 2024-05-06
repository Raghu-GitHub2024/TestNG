package HomeWork;

import java.util.Arrays;

public class Nspace
{
	static int countofspace = 0;
	public static void main(String[] args)
	{
		String name = "abcd efgh 1234";
		char [] a1=name.toCharArray();
		System.out.println(Arrays.toString(a1));
		for(int i=0;i<a1.length;i++)
		{
			boolean ans = Character.isSpaceChar(a1[i]);
			if(ans==true)
			{
				countofspace++;
			}
		}
		System.out.println("Total alpha-->" + countofspace);
		

	}

}

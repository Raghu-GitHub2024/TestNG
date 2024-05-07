package AutomationClass3;

import java.util.Scanner;

public class Voter {

	final static String M = null;
	final static String F = null;
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);	
		System.out.println("Please enter you age:");
		int age = s.nextInt();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the gender:");
		String  gender = s1.next();
		
		if(age >= 18 || gender == M )
		{
			System.out.println(" M is Eligible");
		}
		else if(age >= 18 || gender== F)
			{
			System.out.println(" F is Eligible");
			}
				else
		{
			System.out.println("Not Eligible");
		}

	}

}

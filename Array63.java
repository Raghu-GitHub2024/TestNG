package HomeWork;

import java.util.Scanner;

import java.util.Arrays;

public class Array63 {

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		int [] num = new int[3];
		
		for(int i=-0; i<3; i++) 
		{
			System.out.println("Enter the array-->"+ i);
			num[i] = s1.nextInt();
		}
			System.out.println(Arrays.toString(num));
		}
	}



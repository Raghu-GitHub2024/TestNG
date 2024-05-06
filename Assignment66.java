package HomeWork;
import java.util.Scanner;

import java.util.Arrays;

public class Assignment66 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner class is used to take the input at run time
		int rollno[] = new int[3]; // assigning the rollno int datatype of array 3
		for (int i = 0; i < rollno.length; i++) // for loop for iteration and condition check for variable length 3
		{
			System.out.println("Enter the Array-->" + i);
			rollno[i] = sc.nextInt(); // Enter the value at runtime
		}
		int rollno1[] = new int[3];
		for (int i = 0; i < rollno1.length; i++) {
			System.out.println("Enter the Array-->" + i);
			rollno1[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(rollno));// To display the array values at o/p
		System.out.println(Arrays.toString(rollno1));

		if (Arrays.equals(rollno, rollno1) == true) // if condition check boolean value for both the arrays
		{
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}
	}
}

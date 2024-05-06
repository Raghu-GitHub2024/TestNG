package HomeWork;

import java.util.Scanner;

import java.util.Arrays;

public class Assignment65 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int[] rollno = new int[3];
		for (int i = 0; i < rollno.length; i++) {
			System.out.println("Enter the first Array-->" + i);
			rollno[i] = s1.nextInt();
		}
		int[] rollno2 = new int[3];
		for (int i = 0; i < rollno2.length; i++) {
			System.out.println("Enter the second Array-->" + i);
			rollno2[i] = s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno2));

	}

}

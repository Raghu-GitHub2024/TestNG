package HomeWork;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String input = "bread";
		String input1 = "beard";
		
		char[] c1 = input.toCharArray();
		char[] c2 = input1.toCharArray();
		
		System.out.println("Before sorting ");
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println("after sorting ");
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
	}

}

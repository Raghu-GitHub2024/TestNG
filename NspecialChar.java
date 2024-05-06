package HomeWork;

import java.util.Arrays;

public class NspecialChar {

	static int countofspace = 0;
	static int countofalpha = 0;
	static int countofnumbers = 0;
	static int countofschar = 0;

	public static void main(String[] args) {
		String input = "abcd@#$*123  ";
		char[] c1 = input.toCharArray();
		System.out.println(Arrays.toString(c1));
		for (int i = 0; i < c1.length; i++) {
			if (Character.isAlphabetic(c1[i])) {
				countofalpha++;
			} else if (Character.isDigit(c1[i])) {
				countofnumbers++;
			} else if (Character.isSpaceChar(c1[i])) {
				countofspace++;
			} else {
				countofschar++;
			}
		}
		System.out.println("Number of alphabetic characters: " + countofalpha);
		System.out.println("Number of digits: " + countofnumbers);
		System.out.println("Number of spaces: " + countofspace);
		System.out.println("Number of special characters: " + countofschar);
	}
}
package HomeWork;

import java.util.Scanner;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Assignment98 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);

		try {

			int n1 = s1.nextInt();
			String[] name = new String[n1];
			name[0] = "Ram";
			name[1] = "Sita";
			name[2] = "Laxman";
			name[3] = "Hanuman";
			System.out.println("Values present in 0 - 3 index" + Arrays.toString(name));
			}

		catch (InputMismatchException name) {
			System.out.println(name);
		} catch (ArrayIndexOutOfBoundsException name) {
			System.out.println(name);
		} finally {
			s1.close();
		}
	}
}
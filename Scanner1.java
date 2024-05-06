package HomeWork;
import java.util.Scanner;

public class Scanner1 {
		public static void main(String[] args) 
		{
			Scanner SC = new Scanner(System.in);
			
			System.out.println("Enter First:");
			int line = SC.nextInt();
			System.out.println("Enter Second:");
			int line2 = SC.nextInt();
		
			
			int sum = line +line2;
			System.out.println("sum of Two values is : "+ sum);
			int sub = line -line2;
			System.out.println("Subtraction of Two value is : "+ sub);
			int mult = line *line2;
			System.out.println("Multiplication of Two values is : "+  mult);
			int div = line /line2;
			System.out.println("Division of Two value is : "+ div);
			int mod = line %line2;
			System.out.println("Modules of Two value is : " + mod);
	}

}

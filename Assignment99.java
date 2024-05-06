package HomeWork;

public class Assignment99 {

	public static void main(String[] args) {
		int a = 0, b = 0, c=0;
		
		try 
		{
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Exceptation handled");
		}

		finally {
			System.out.println("Program has been executed completly");
		}
	}

}

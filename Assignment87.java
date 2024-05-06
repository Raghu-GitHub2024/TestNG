package HomeWork;

public class Assignment87 {

	static int sum = 0;
	static double average = 0;
	static int reminder = 0;

	public static void main(String[] args) 
	{
		int number[] = new int[4];
		number[0] = 14;
		number[1] = 15;
		number[2] = 57;
		number[3] = 99;

		for (int i = 0; i < number.length; i++)
		{

			sum = sum + number[i];
			average = sum / number.length;
			reminder = sum % number.length;

		}
		System.out.println("Sum of-->"+sum);
		System.out.println("Average of -->"+average);
		System.out.println("Reminder of -->"+reminder);

	}

}

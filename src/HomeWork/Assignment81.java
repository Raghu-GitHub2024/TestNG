package HomeWork;

public class Assignment81 {

	public static void main(String[] args) 
	{
		
		String input = "Manish";
		
		System.out.println(input.matches("M(.*)"));
		
		System.out.println(input.matches("(.*)h"));
		
		String S1 = "Malik";
		
		System.out.println(S1.matches("...."));
		
		String S2 = "School";
		int S3 = S2.lastIndexOf('l');
		System.out.println(S3);
		
		String S4 = "Basha";
		boolean S5 = S4.equals("Basha1");
		System.out.println(S5);
		
	
	}

}

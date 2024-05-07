package AutomationClass3;

public class StringRev {

	public static void main(String[] args)
	{
		String input = "Raghu";
		for(int i = input.length()-1; i>=0; i--)
		{
			char a1 = input.charAt(i);
			System.out.println(a1);
		}
	}

}

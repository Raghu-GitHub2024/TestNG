package AutomationClass3;

public class Matches {

	public static void main(String[] args)
	{
		String input = "Manish";
		
		System.out.println(input.matches("M(.*)"));
		System.out.println(input.matches("(.*)h"));
		
		String ip ="malik";
		System.out.println(ip.matches("....."));
		
		String a1 = "School";
		System.out.println(a1.lastIndexOf("o"));
		
		/*
		 * String c1 = "The Java Program"; String repeatedString = c1.repeat(3); //
		 * Repeat the string 3 times System.out.println(repeatedString);
		 */
		
		String b1 = "The Java Program";
		String[] words = b1.split(" "); // Split the string based on spaces
		for (String word : words) {
		    System.out.println(word);
		}

	}
	

}

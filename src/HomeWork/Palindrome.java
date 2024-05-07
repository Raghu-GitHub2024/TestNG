package HomeWork;

public class Palindrome 
{
	
	public static void main(String[] args)
	{
		String palin = "radar";
		String rever = "";
		for(int i=palin.length()-1; i>=0; i--) 
		{
			char pa =palin.charAt(i);
			rever = rever+pa;
			}
		System.out.println(rever);
		
		if(palin.equals(rever)) 
		{
			System.out.println("it is a palindrome");
			
		}
		else
		{
			System.out.println("it is not a palindrome");
		}

	}

}

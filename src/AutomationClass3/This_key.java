package AutomationClass3;

public class This_key {
	
	This_key()
	{
		this(10);
		System.out.println("1");
	}
	This_key(int a)
	{
		this(10.1);
		System.out.println("2");
		
	}
	This_key(double b)
	{
		this("Hi");
		System.out.println("3");
		}
	This_key(String c)
	{
		
		System.out.println("Hello");
	}
	
	public static void main(String[] args)
	{
		This_key T= new This_key();

	}

}

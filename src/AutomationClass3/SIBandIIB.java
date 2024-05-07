package AutomationClass3;

public class SIBandIIB {
	{
		System.out.println("IIB");
	}
	{
		System.out.println("IIB2");
	}
	SIBandIIB()
	{
		System.out.println("Constructor");
	}
	static 
	{
		System.out.println("SIB");
	}
	static 
	{
		System.out.println("SIB2");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main Method");
		SIBandIIB A = new SIBandIIB();
	}
	
}

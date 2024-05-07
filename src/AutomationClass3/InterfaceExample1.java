package AutomationClass3;

interface keyword
{
	void login();
}

public class InterfaceExample1 implements keyword
{

	public static void main(String[] args) 
	{
		InterfaceExample1 I1 = new InterfaceExample1();
		I1.login();
	
	}
	public void login()
	{
		System.out.println("Login with mob.no");
		
	}

}

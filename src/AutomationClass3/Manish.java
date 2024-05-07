package AutomationClass3;

public class Manish {
	
	Manish()//Method1
	{
		System.out.println("Constructor");
		}

	void add()//Method2
	{
		System.out.println("Nonstatic Method");
	}
	static void sub()//Method3
	{
		System.out.println("Static Method");
	}
	public static void main(String[] args) //Method4
	{
		// TODO Auto-generated method stub
		Manish n1=new Manish();
		n1.add();
		sub();
		
		

	}

}

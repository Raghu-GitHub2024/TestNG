package AutomationClass3;

public class NonParaConstructor
{
	NonParaConstructor()
	{
		System.out.println("1");
	}
	NonParaConstructor(int a)
	{
		System.out.println("2");
	}
	NonParaConstructor(String a)
	{
		System.out.println("2.5");
	}
	NonParaConstructor(int a, int b, int c, int d, int e, int f)//Constructor Overloading 
	{
		System.out.println("3");
	}

	public static void main(String[] args)
	{
	NonParaConstructor n1 = new NonParaConstructor(); /*object creation to invoke the constructor methods*/
	NonParaConstructor n2 = new NonParaConstructor(100);
	NonParaConstructor n4 = new NonParaConstructor("abcd");
	NonParaConstructor n3 = new NonParaConstructor(1, 2, 3, 4, 5, 6);
	
	}
}

package AutomationClass3;

class one
{
	one()
	{
		System.out.println("super class");
	}
	
}

class two extends one
{
	
	two()
	{
		System.out.println("parent class");
	}
}

class three extends two
 {
	
	three()
	{
		System.out.println("child class");
	}
	
	
}
public class Supercallingimplicit {
	
	

	public static void main(String[] args) {
		
		new three();
	}

}

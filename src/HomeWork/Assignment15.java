package HomeWork;

/*Assignment 15 
 * Date:07-04-2024
 * Sunday
 */

interface Amazon_Login {
	abstract void un_ID();//Abstract Method1

	abstract void un_pwd();//Abstract Method2

}
public class Assignment15 implements Amazon_Login {

	public static void main(String[] args) 
	{
		Assignment15 U1 = new Assignment15(); // Reference object for child class -->with concrete class
		U1.un_ID();
		U1.un_pwd();

	}

	@Override
	public void un_ID() 
	{
				System.out.println("Enter the User ID");
	}

	@Override
	public void un_pwd() 
	{
			System.out.println("Enter the Password");
	}

}


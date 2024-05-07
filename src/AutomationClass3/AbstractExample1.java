package AutomationClass3;

/*Assignment 14
 * Date:07-04-2024
 * Sunday
 */

class Amazon_Auth { // Concrete Class is Grand parent class
	void un_as_email1() // Concrete Method
	{
		System.out.println("Concrete Method1");
	}

	void un_as_mob() // Concrete Method
	{
		System.out.println("Concrete Method1");
	}

}

abstract class Amazon_login extends Amazon_Auth { // Abstract Class extends Concrete class (parent class)
	abstract void registration_button();// abstract method

	abstract void un_as_email();// abstract method

	void un()// Concrete Method
	{
		System.out.println("2AM and 2CM");
	}

	void un_mob()// Concrete Method
	{
		System.out.println("2AM and 2CM");
	}
}

class AbstractExample1 extends Amazon_login { // Concrete Class extends abstract class (child class)
	void un_as_biometric() // Concrete Method
	{
		System.out.println("Concrete Method2");
	}

	void un_as_face() // Concrete Method
	{
		System.out.println("Concrete Method2");
	}

	public static void main(String[] args) {

		AbstractExample1 A1 = new AbstractExample1();
		A1.un_as_email1();
		A1.un_as_mob();
		A1.un();
		A1.un_mob();
		A1.un_as_biometric();
		A1.un_as_face();
		A1.registration_button();
		A1.un_as_email();
	}

	@Override
	void registration_button() 
	{
		System.out.println("Abstract 1");
	}

	@Override
	void un_as_email() 
	{
		
		System.out.println("Abstract 2");

	}

}

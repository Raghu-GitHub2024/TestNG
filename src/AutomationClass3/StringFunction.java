package AutomationClass3;

public class StringFunction
{

	public static void main(String[] args) 
	{
		String name ="School";
		System.out.println("length of the string: " + name.length());
		System.out.println( name.charAt(2));
		System.out.println( name.indexOf('c'));
		System.out.println( name.toUpperCase());
		System.out.println( name.toLowerCase());
		System.out.println( name.concat("name is MVM"));
		String first_name= "raghu";
		String second_name= "veer";
		System.out.println(first_name.concat(" ").concat(second_name));
		System.out.println(name.contains("Sch"));
		
	}

}

package HomeWork;

public class Assignment89 {

	public static void main(String[] args)
	
	{
		/*
		 * String S1 = "0123456a bc";
		 * 
		 * if(S1.matches("[0-9]+") && S1.length()>2) {
		 * System.out.println("String  have only Digits"); }else {
		 * System.out.println("String have both digits and characters"); }
		 */
		String regex = "[0-9]+";
		String str = "23343453";
		System.out.println(str.matches(regex));
		
	}

}

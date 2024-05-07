package AutomationClass3;

import java.util.Date;

public class Assign60 {

	public static void main(String[] args) 
	{
		Date D1 = new Date();
		System.out.println(D1.getTime());
		Date D2 = new Date(D1.getTime()+(60*60*1000*24*1));
	 	System.out.println(D2);

	}

}

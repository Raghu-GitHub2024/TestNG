package HomeWork;

import java.util.Date;

public class CheckingDate {

	public static void main(String[] args) 
	{
		Date D1 = new Date();
		System.out.println(D1.getTime());
		System.out.println(D1);
		String input = D1.toString();
		System.out.println(input);
		String date = input.substring(7,10);
		System.out.println(date);
		String month = input.substring(3, 7);
		System.out.println(month);
		String year = input.substring(input.length()-4);
		System.out.println(year);
		System.out.println(date.concat(" ")+month.concat(" ")+year.concat(" "));
		System.out.println(date.concat("-")+month.concat("-")+year.concat(""));
		System.out.println(date.concat("/")+month.concat("/")+year.concat(""));
	}

}

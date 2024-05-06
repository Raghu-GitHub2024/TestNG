package HomeWork;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an int:" );
		int num = sc.nextInt();
		System.out.println("Integer: "+ num);
				
		System.out.println("Enter an byte:" );
		byte byt1 = sc.nextByte();
		System.out.println("Byte: "+ byt1);
		
		System.out.println("Enter an boolean:" );
		boolean boo = sc.nextBoolean();
		System.out.println("Boolean: "+ boo);
				
		System.out.println("Enter an short:" );
		short shrt = sc.nextShort();
		System.out.println("short: "+ shrt);
		
		System.out.println("Enter an Double:" );
		double db = sc.nextDouble();
		System.out.println("Double: "+ db);
		
		System.out.println("Enter an float:" );
		float ft = sc.nextFloat();
		System.out.println("float: "+ ft);

		System.out.println("Enter an long:" );
		long lg = sc.nextLong();
		System.out.println("long: "+ lg);
		
		System.out.println("Enter an string :" );
		String character = sc.next();
		System.out.println("String : "+ character);


	}

}

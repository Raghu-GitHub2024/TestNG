package AutomationClass3;

public class Date22041 {
	
	static int sum;
	static double average;
	
	public static void  main(String[] args)
	{
		int number[]= new int[4];
		number[0]= 40;
		number[1]= 30;
		number[2]= 20;
		number[3]= 10;
		
		for(int i=0;i<=number.length;i++) {
			
			sum = sum + number.length;
			average = sum/number.length;
		}
		
		System.out.println(sum);
		System.out.println(average);
	}

}

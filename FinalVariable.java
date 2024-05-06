package HomeWork;

public class FinalVariable 
{
	final static  double pi = 3.14;
	final static int rad= 5;
	
	 static void circle()
	 {
		final double circle = pi*rad*rad;
		System.out.println(circle);
	}
	
	 final void circum() //non static method 
	 {
		double circum = 2*pi*rad;
		System.out.println(circum);
		
	}
	
	public static void main(String[] args)
	{
		circle();	
		FinalVariable n1 = new FinalVariable();//object and reference variable for non static method 
		n1.circum();
		

	}

}

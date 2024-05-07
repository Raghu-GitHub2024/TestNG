package AutomationClass3;

class college
{
	college(String col_name, int roll_no)
	{
		
		System.out.println("GroTecgminds");
		
	}
	
}

class school extends college
{
	school(int a,String b, double c)
	{
		super("Gro", 101);
		System.out.println("Super Class");
	}
	
}


public class Supercallingconst {

	public static void main(String[] args) 
	{
		school S = new school(10, "Raghav", 87.90);
		
		

	}

}

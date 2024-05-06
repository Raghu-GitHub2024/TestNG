package HomeWork;


class Encapsulation
{
	
	private String un = "Encapsule.com";

	public String getUn() 
	{
		return un;
	}

	public void setUn(String un) 
	{
		this.un = un;
	} 

}
public class Assignment100
{
	public static void main (String[] args)
	{
		Encapsulation A1= new Encapsulation();
		A1.setUn("MKT_Encapsulation.com ");
		System.out.println(A1.getUn());
		}
	
}

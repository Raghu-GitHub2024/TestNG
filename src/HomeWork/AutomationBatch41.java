package HomeWork;


class Parent{
	
	
}

public class AutomationBatch41 extends Parent {

	public static void main(String[] args) 
	{
		  Parent a =new AutomationBatch41();//implicitly
		  
		  Parent a1 = (Parent) new  AutomationBatch41();//Explicitly
		  
		  AutomationBatch41 a2 = (AutomationBatch41) a1;//downcasting explicitly
		 
	}

}

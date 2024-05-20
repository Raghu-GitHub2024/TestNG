package HomeWork;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment111 {

	public static void main(String[] args) 
	{
		
		ArrayList A1 = new ArrayList();
		A1.add("Ram");
		A1.add("Manish");
		A1.add(12);
		A1.add("67");
		A1.add(true);
		A1.add(98);
		
		System.out.println(A1);
		
		Iterator i1= A1.iterator();
		
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}

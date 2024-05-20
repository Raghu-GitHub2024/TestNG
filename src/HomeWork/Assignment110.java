package HomeWork;

import java.util.ArrayList;

public class Assignment110 {

	public static void main(String[] args) 
	{
		ArrayList A1 = new ArrayList();
		
		A1.add("Ram");
		A1.add("suresh");
		A1.add(12);
		A1.add("77");
		A1.add(true);
		A1.add(98);
				
		A1.remove(0);
		System.out.println(A1);
		A1.remove("77");
		System.out.println(A1);
		
		//A1.clear();
		System.out.println("After clearing A1-->"+A1);
		boolean answer = A1.isEmpty();
		System.out.println(answer);
		
		
		 ArrayList A2 = new ArrayList();
		  
		 A2.addAll(A1); A2.add(1, "Manish");
		 A2.addAll(0, A1);
		 System.out.println(A2); 
		 System.out.println("before removing-->"+A2);
		/* A2.removeAll(A1); 
		 System.out.println("After removing-->"+A2);*/
		 
		 ArrayList A3 = new ArrayList();
		 A3 = (ArrayList) A2.clone();
		 System.out.println(A3);
		 
		
		
	
		

	}

}

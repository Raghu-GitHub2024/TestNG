package HomeWork;

public class Assignment95 {

	public static void main(String[] args)
	{
		
		   int[] arr;
		   
		  arr = new int[4];
		  arr[0]=0;
		  arr[1]=1;
		  arr[2]=2;
		  arr[3]=3;
		//  arr[4]=5;
		  
		for(int i=0; i<arr.length; i++) 
		{
			assert arr.length>=arr[3];
			System.out.println(i+":"+arr[i]);
		}
		
		
	}

}

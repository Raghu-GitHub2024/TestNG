package HomeWork;

public class Assignment74 {

	public static void main(String[] args)
	{
		int nums[] = new int[5];
		nums[0]=90;
		nums[1]=12;
		nums[2]=41;
		nums[3]=50;
		nums[4]=60;
		int givenno=41;
		
		for(int i=0; i<nums.length;i++) 
		{
			if(givenno==nums[i])//this will compare with  the givenno variable with the values inside the nums arrays
			{
				System.out.println("it is present in "+i);
			}else {
				System.out.println("it is not present in "+i);
			}
		}

	}

}

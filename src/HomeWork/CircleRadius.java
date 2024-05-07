package HomeWork;
/*Assignment 17 
 * Date:14-04-2024
 * Sunday
 */
public class CircleRadius
{
	public static void main(String[] args)
	{
		
		final int NUM_Circle= 10;
		System.out.println("Radius of 10 Circle:");
		
		for(int i = 0; i<NUM_Circle; i++) //for loop to have iteration with +1 
		{
			double radius = Math.random()*10;//to start the iteration from 1 to 10
			double circle = Math.PI*radius*radius;//fetching random value as radius to get area of circle
			
			System.out.println("circle "+(i+1)+":"+radius);
			System.out.println("Area of  Circles: "+circle);
		}
	}
}

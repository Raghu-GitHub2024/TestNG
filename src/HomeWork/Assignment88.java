package HomeWork;

public class Assignment88 
{
    public static void main(String[] args) 
    {
        int[] intArray = {1, 2, 3, 4};
        double[] doubleArray = {11.5, 12.5, 13.5, 14.5};

        double intSum = 0;
        double doubleSum = 0;

        for (int i = 0; i < 4; i++)
        {
            intSum = intSum + intArray[i];
            doubleSum = doubleSum + doubleArray[i];
        }

        double intAverage = intSum / 4;
        double doubleAverage = doubleSum / 4;

        System.out.println("Average of int array: " + intAverage);
        System.out.println("Average of double array: " + doubleAverage);
    }
}


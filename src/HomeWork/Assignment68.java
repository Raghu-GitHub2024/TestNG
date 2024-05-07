package HomeWork;

import java.util.Scanner;

import java.util.Arrays;

public class Assignment68 {

    public static void main(String[] args) 
    {
        Scanner s1 = new Scanner(System.in);
        boolean rollno[] = new boolean[3];
        
        for (int i = 0; i <3; i++)
        {
            System.out.println("Enter the Array-->" + i);
            rollno[i] = s1.nextBoolean();
        }

        boolean rollno1[] = new boolean[3];
        for (int i = 0; i <3; i++) 
        {
            System.out.println("Enter the Array-->" + i);
            rollno1[i] = s1.nextBoolean();
        }
        System.out.println(Arrays.equals(rollno, rollno1));
        

        if (Arrays.equals(rollno, rollno1)==true)
        {
            System.out.println("Both are equal ");
        } else
        {
            System.out.println("Not equal");
        }

    }
}

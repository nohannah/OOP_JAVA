package Assignment1;

import java.util.Scanner;

public class Factorial {
    public static void main (String [] args)
    {
        //Create a scanner object conencted to standard input (keyboard)
        Scanner number= new Scanner(System.in);

        System.out.println("Enter the number : ");
        long n=number.nextInt();

        long fact=1;
        for (int i=1 ; i <=n ; i++ )
        {
            fact*=i;
        }

        System.out.println("Factorial of " +  n  + " is " + fact);

        number.close();
    }
}


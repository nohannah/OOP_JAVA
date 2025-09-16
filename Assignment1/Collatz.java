package Assignment1;

import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n= num.nextInt();
        while(n!= 1)
        {
            if(n%2==0)
            {
                n=n/2;
                System.out.println(n);
                
            }
            else 
            {
                n= 3*n+1;
                System.out.println(n);
            }
        }
        num.close();
    }
}

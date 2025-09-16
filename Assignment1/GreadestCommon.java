package Assignment1;

import java.util.Scanner;

public class GreadestCommon {
    public static void main(String[] args) {
        Scanner num1=new Scanner(System.in);
        System.out.println("Enter the number a:");
        int a=num1.nextInt();
        System.out.println("Enter the number b:");
        int b=num1.nextInt();
        int GCD=0;
        for(int i=1 ; i<=a && i<=b  ; i++)
        {
                
            if(a%i==0 && b%i==0)
            {
                GCD=i;
            }
        }
        System.out.println("Common Divisor is " + GCD );
       num1.close();
    }
}

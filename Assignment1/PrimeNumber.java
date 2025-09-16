package Assignment1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=num.nextInt();
        Boolean flag=true; ; 
        if(n >1 )
        {
            for(int i=2; i<= n/2 ; i++)
            {
                if(n%i==0)
                {
                    flag=false;
                    break;
                }      
            }
        }
        else
        {
            flag=true;
        }
        if(flag==false)
        {
            System.out.println("This is not a prime number");
        }
        else
        {
            System.out.println("This is a prime number");
        }
        num.close();
    }
}

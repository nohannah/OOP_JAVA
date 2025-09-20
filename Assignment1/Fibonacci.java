package Assignment1;

import java.util.Scanner;

public class Fibonacci { 
    static int fibo(int n)
    {
        if(n<=1)
        {
            return n ;
        } 
        return fibo(n-1)+fibo(n-2);       
       
    }

    public static void main(String[] args)
    {
       
        Scanner number= new Scanner(System.in) ; 
        System.out.println("Enter the number : ");
        int n= number.nextInt();

        System.out.println("Fibonacci series up to:" + n ) ;
        //int fibonacci; 
        for (int i=0 ; i<n ; i++)
        {
            System.out.print(fibo(i)+ " ");
            
        }
        System.out.println();
        number.close();
    }
    
    
}

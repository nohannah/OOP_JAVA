package Practice1;

import java.util.Scanner;

public class SumOddEven {
    public static void main(String[] args) {
    Scanner num= new Scanner(System.in);
    System.out.println("Enter the m number : ");
    int m=num.nextInt();
    System.out.println("Enter the n number : ");
    int n = num.nextInt();
   while (n<m)
    {
        System.out.println("m number must be less or equal to n ");
         n=num.nextInt();
    }
    int sumEven = 0;
    long productOdd=1; 
    for (int i=m ; i<=n ; i++)
    {
        if(i%2==0)
        {
            sumEven+=i;
        }
        else 
        {
            productOdd*=i;
        }
    }
    System.out.println("The sumof even is : " + sumEven);
    System.out.println("Product of odd is : " + productOdd);
    num.close();
}
}
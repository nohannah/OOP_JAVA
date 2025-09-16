package Assignment1;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num= n.nextInt();
        int sum_even=0, Sum_odd=0;
        for(int i=1; i<= num ; i++  )
        {
            if( i % 2==0)
            {
                sum_even+=i;
            }
            else {
                Sum_odd+=i;
            }
        }
        System.out.println("Sum of even numbers is: "+ sum_even);
        System.out.println("Sum of odd numbers is: "+ Sum_odd);
        n.close();
    }
    
}

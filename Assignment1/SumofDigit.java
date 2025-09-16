package Assignment1;

import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("Enter the Number:"); 
        int n = num.nextInt();
        //counting the number of digits
        String numString = String.valueOf(n);
        int digit = numString.length();
        int sum = 0;
        for (int i=0; i<digit ; i++ )
        {
            sum = sum + n % 10; // take the reminder and add it to the sum variable
            n = n / 10; // take the result and drop the reminder
        }
         System.out.println("The sum of the digits is: " + sum);
        num.close();
    }
}

package Assignment1;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner num= new Scanner( System.in);
        System.out.println("Enter the Number:");
        int n= num.nextInt();
        //counting the number of digits
        String numString = String.valueOf(n);
        int digit = numString.length();
        //System.out.println("Number of digits: " + digit);

        int reverse = 0;
        for ( int i=0; i<digit ; i++ )
        {
          reverse = reverse * 10 + n % 10; // take the reminder and add it to the reverse variable
            n = n / 10; // take the result and drop the reminder
        }
        System.out.println("The reverse of the number is: " + reverse);
        num.close();
    }
}

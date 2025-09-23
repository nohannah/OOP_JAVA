package Assignment1;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner num= new Scanner( System.in);
        System.out.println("Enter the Number:");
        int n= num.nextInt();
        //counting the number of digits
        //String numString = String.valueOf(n);
        //int digit = numString.length();
        //System.out.println("Number of digits: " + digit);
        boolean isNegative = n < 0;
        n=Math.abs(n);
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + n % 10; // take the last digit
            n = n / 10;                      // drop the last digit
        }

        if (isNegative) {
            reverse = -reverse; // put back the minus sign
        }
        System.out.println("The reverse of the number is: " + reverse);
        num.close();
    }
}
